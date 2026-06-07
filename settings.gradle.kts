pluginManagement {
	repositories {
        maven {
			url = uri("https://maven.aliyun.com/repository/public/")
		}
        maven {
			url = uri("https://maven.aliyun.com/repository/spring/")
		}
        maven {
			url = uri("https://maven.aliyun.com/repository/google/")
		}
        maven {
			url = uri("https://maven.aliyun.com/repository/gradle-plugin/")
		}
        maven {
			url = uri("https://maven.aliyun.com/repository/spring-plugin/")
		}
        maven {
			url = uri("https://maven.aliyun.com/repository/grails-core/")
		}
        maven {
			url = uri("https://maven.aliyun.com/repository/apache-snapshots/")
		}

		maven {
			name = "Fabric"
			url = uri("https://maven.fabricmc.net/")
		}
		mavenCentral()
		gradlePluginPortal()
	}

	plugins {
		id("net.fabricmc.fabric-loom") version providers.gradleProperty("loom_version")
	}
}

// Should match your modid
rootProject.name = "hidden-world-border"
