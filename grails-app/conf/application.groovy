import grails.util.Metadata

grails.project.groupId = 'au.org.ala.regions'

grails.serverURL = 'http://local.ala.org.au'

ignoreCookie = 'true'
security {
    cas {
        // appServerName is automatically set from grails.serverURL

        uriFilterPattern = '/alaAdmin.*'
        uriExclusionFilterPattern = '/assets/.*,/images/.*,/css/.*,/js/.*,/less/.*'

        //authenticateOnlyIfLoggedInPattern requires authenticateOnlyIfLoggedInPattern to identify 'logged in' when ignoreCookie='true'
        authenticateOnlyIfLoggedInPattern = '.*'
    }
}

appName = Metadata.current.'app.name' ?: "regions"

/******************************************************************************\
 *  CONFIG MANAGEMENT occurs in Application.groovy and uses 'config_dir'
 \******************************************************************************/
config_dir = "/data/${appName}/config/"

/******************************************************************************\
 *  SKINNING
 \******************************************************************************/
//ala.skin = 'ala'

/******************************************************************************\
 *  app specific config
 \******************************************************************************/

// switch this on to query hub specific data
hub.enableHubData = false
// add hub id here eg. "data_hub_uid:dh10"
hub.hubFilter = ""

// switch on query context
biocache.enableQueryContext = false
// add query context eg. 'cl2110:"Murray-Darling Basin Boundary"'
biocache.queryContext = ""

// show only regions that intersect with an ALA OBJECT
layers.enableObjectIntersection = false
layers.intersectObject = ""

// configuration to show a default layer on the map. This layer is on top of the layers selected from accordion.
// helpful for regions app implementation for a hub.
layers.showQueryContext = false
layers.queryContextName = ''
layers.queryContextShortName = ''
layers.queryContextDisplayName = ''
layers.queryContextFid = ''
layers.queryContextBieContext = ''
layers.queryContextOrder = ''

//
// Application defaults
//
ala.baseURL = 'http://ala.org.au'
bie.baseURL = 'http://bie.ala.org.au'
biocache.baseURL = 'http://biocache.ala.org.au'
spatial.baseURL = 'http://spatial.ala.org.au'
images.baseURL = 'http://images.ala.org.au'
layersService.baseURL = 'http://spatial.ala.org.au/ws'
logger.baseURL = 'http://logger.ala.org.au'
alerts.baseURL = 'http://alerts.ala.org.au'
biocache.records.url = 'http://biocache.ala.org.au/'
biocache.search = 'occurrences/search'
biocache.occurrences.json = 'ws/occurrences/search.json'
bieService.baseURL = 'http://bie.ala.org.au/ws'
geoserver.baseURL = 'http://spatial.ala.org.au/geoserver'
biocacheService.baseURL = 'http://biocache.ala.org.au/ws'

layout.skin = 'main'
accordion.panel.maxHeight = ''
map.height = ''
map.bounds = '[]'

//headerAndFooter.baseURL='https://www2.ala.org.au/commonui-bs3'
headerAndFooter.baseURL = 'https://wpprod2017.ala.org.au/commonui-bs3-v2/commonui-bs3'

biocache.filter = "&fq=rank:(species%20OR%20subspecies)&fq=-occurrence_status_s:absent&fq=geospatial_kosher:true&fq=occurrence_year:*"

//google.apikey=

grails.cache.enabled = true
grails.cache.config = {
    cacheManager 'GrailsConcurrentLinkedMapCacheManager'

    cache {
        name 'metadata'
        maxCapacity = 100000
        timeToLiveSeconds 86400
        eternal false
        overflowToDisk false
        maxElementsOnDisk 0
    }

    defaultCache {
        maxCapacity = 1000
        timeToLiveSeconds 86400
        eternal false
        overflowToDisk false
        maxElementsOnDisk 0
    }

    defaults {
        maxCapacity = 1000
        timeToLiveSeconds 86400
        eternal false
        overflowToDisk false
        maxElementsOnDisk 0
    }
}


headerAndFooter.excludeApplicationJs = true
orgNameLong = 'Atlas of Living Australia'
breadcrumbParent = 'https://www.ala.org.au/explore-by-location/,Explore'

//google.apikey=

habitat.layerID = '918'
map.bounds = '[-44, 112, -9, 154]'