pluginManagement {
    repositories {
        google {
            content {
                includeGroupByRegex("com\\.android.*")
                includeGroupByRegex("com\\.google.*")
                includeGroupByRegex("androidx.*")
            }
        }
        mavenCentral()
        gradlePluginPortal()
    }
}
dependencyResolutionManagement {
    repositoriesMode.set(RepositoriesMode.FAIL_ON_PROJECT_REPOS)
    repositories {
        google()
        mavenCentral()
        maven (url ="https://repository.liferay.com/nexus/..." )
        maven ( url ="https://jitpack.io" )
        maven(url ="https://repository.liferay.com/nexus/content/repositories/public/" )
    }
}

rootProject.name = "PDFViewer"
include(":app")
 