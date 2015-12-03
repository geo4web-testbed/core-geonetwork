import iso19139.SummaryFactory

def isoHandlers = new iso19139.Handlers(handlers, f, env)

SummaryFactory.summaryHandler({it.parent() is it.parent()}, isoHandlers)

handlers.start {
    '''
	<!DOCTYPE html>
<html lang="nl">
  <head>
    <meta charset="utf-8">
    <meta http-equiv="X-UA-Compatible" content="IE=edge">
    <meta name="viewport" content="width=device-width, initial-scale=1">
    <title>Testbed data on the web</title>
	<link href=http://getbootstrap.com/dist/css/bootstrap.min.css rel=stylesheet> 
	<style>
	.toggler,.view-outline,.summary-links-associated-link {display:none}
	.coord { float:left;width:25%; padding:2px; padding: 3px; }
	.extent img { clear:both; padding: 5px; }
	</style>
  </head>
  <body>
  <nav class="navbar navbar-default navbar-fixed-top">
      <div class="container">
        <div class="navbar-header">
          <button type="button" class="navbar-toggle collapsed" data-toggle="collapse" data-target="#navbar" aria-expanded="false" aria-controls="navbar">
            <span class="sr-only">Toggle</span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
            <span class="icon-bar"></span>
          </button>
          <a class="navbar-brand" href="catalog.search">Geo4web #4</a>
        </div>
        <div id="navbar" class="collapse navbar-collapse">
          <ul class="nav navbar-nav">
            <li><a href="catalog.search#/search">Zoeken</a></li>
			<li><a href="catalog.search#/map">Kaart</a></li>
            <li><a href="http://www.geonovum.nl/onderwerp-artikel/testbed-locatie-data-het-web">Over</a></li>
            
          </ul>
        </div>
      </div>
    </nav>
    <div class="container"><div style="padding-top:40px">
	'''
	  
	  
}


commonHandlers = new common.Handlers(handlers, f, env)

isofunc = new iso19139.Functions(handlers: handlers, f:f, env:env, commonHandlers: commonHandlers)
        

def citationEl = { el ->
        Set processedChildren = ['gmd:title', 'gmd:alternateTitle', 'gmd:identifier', 'gmd:ISBN', 'gmd:ISSN',
                                 'gmd:date', 'gmd:edition', 'gmd:editionDate', 'gmd:presentationForm']

        def otherChildren = el.children().findAll { ch -> !processedChildren.contains(ch.name()) }

        def model = [
                title :  handlers.processElements([el.'gmd:title']),
                altTitle : handlers.processElements([el.'gmd:alternateTitle']),
                date : handlers.processElements(el.'gmd:date'.'gmd:CI_Date'),
                editionInfo: commonHandlers.func.textEl(el.'gmd:edition'.text(), el.'gmd:editionDate'.'gco:Date'.text()),
                identifier : isofunc.isoTextEl(el.'gmd:identifier', el.'gmd:identifier'.'*'.'gmd:code'.text()),
                presentationForm : isofunc.isoTextEl(el.'gmd:presentationForm', f.codelistValueLabel(el.'gmd:presentationForm'.'gmd:CI_PresentationFormCode')),
                ISBN : handlers.processElements(el.'gmd:ISBN'),
                ISSN : handlers.processElements(el.'gmd:ISSN'),
                otherData : handlers.processElements(otherChildren)
        ]
        return handlers.fileResult("html/citation.html", model)
    }

handlers.add 'gmd:CI_Citation', citationEl	
	
handlers.end {
    '''</div></div><script src=https://ajax.googleapis.com/ajax/libs/jquery/1.11.3/jquery.min.js></script>
	<script src=../dist/js/bootstrap.min.js>
	</body>
	</html>'''
}