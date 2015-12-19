
var map = L.map('map',{
    layers: [
        new L.TileLayer(
            'http://{s}.tile.openstreetmap.org/{z}/{x}/{y}.png',
            {
                attribution: 'Map data © <a href="http://openstreetmap.org">OpenStreetMap</a> contributors'
            }
        )
    ]
}).setView([y1+(y2-y1)/2, x1+(x2-x1)/2], 9);

var geojsonFeature = {
    "type": "Feature",
    "properties": {"party": "Republican"},
    "geometry": {
        "type": "Polygon",
        "coordinates": [[
            [x1, y1],
            [x1, y2],
            [x2, y2],
            [x2, y1],
            [x1, y1]
        ]]
	}
};

var myStyle = {
    "color": "#666699",
    "weight": 2,
    "opacity": 0.65
};


L.geoJson(geojsonFeature,{style: myStyle}).addTo(map).on('mouseover', function(e) {
  var popup = L.popup()
   .setLatLng(e.latlng) 
   .setContent('Dataset locatie')
   .openOn(map);
});

map.fitBounds([[y1,x1],[y2,x2]]);
