grails.project.groupId="com.mti.latch"
grails.project.class.dir = "target/classes"
grails.project.test.class.dir = "target/test-classes"
grails.project.test.reports.dir	= "target/test-reports"
//grails.project.war.file = "target/${appName}-${appVersion}.war"

grails.project.dependency.distribution = {
    remoteRepository(id:"libs-releases-local", url:"http://xxx.xxx.xxx.xxx:8081/artifactory/libs-releases-local"){
        authentication(username:"xxx-xxx",password:"xxx")
    }
}
grails.project.dependency.resolution = {
    // inherit Grails' default dependencies
    inherits( "global" ) {
        // uncomment to disable ehcache
        // excludes 'ehcache'
    }
    log "warn" // log level of Ivy resolver, either 'error', 'warn', 'info', 'debug' or 'verbose'
    repositories {

        mavenRepo "http://xxx.xxx.xxx.xxx:8081/artifactory/libs-releases-local/"
        mavenRepo "http://xxx.xxx.xxx.xxx:8081/artifactory/libs-snapshots-local/"

        // grailsPlugins()
        grailsHome()
        grailsCentral()

        // uncomment the below to enable remote dependency resolution
        // from public Maven repositories
        //mavenLocal()
        //mavenCentral()
        //mavenRepo "http://snapshots.repository.codehaus.org"
        //mavenRepo "http://repository.codehaus.org"
        //mavenRepo "http://download.java.net/maven/2/"
        //mavenRepo "http://repository.jboss.com/maven2/"
    }
    plugins {
        build "org.grails.plugins:maven-publisher:0.6"
    }
    dependencies {
        // specify dependencies here under either 'build', 'compile', 'runtime', 'test' or 'provided' scopes eg.
        build 'org.codehaus.jackson:jackson-core-asl:1.5.6'
        build 'org.codehaus.jackson:jackson-mapper-asl:1.5.6'
    }
}
