rootProject.name = "document-handler"

pluginManagement {
    val kotlinVersion: String by settings
    plugins{
        kotlin("jvm") version kotlinVersion
    }
}

include("excel-handler")
include("excel-handler")
