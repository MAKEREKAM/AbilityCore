plugins {
    kotlin("jvm") version "1.9.10"
}

group = "kr.vanilage"
version = "1.0" // 여기에 버전을 작성하세요.

var buildPath = ""

repositories {
    mavenCentral()
    maven("https://repo.papermc.io/repository/maven-public/")
}

dependencies {
    compileOnly("io.papermc.paper:paper-api:1.20.1-R0.1-SNAPSHOT"); // 여기 버전을 바꿀수 있습니다.
}

task("copy") {
    doLast {
        copy {
            from("build/libs") // 파일이 나오는 주소를 설정하세요.
            include("*.jar")
            into(buildPath)
        }

        delete(buildPath.plus("\\RELOAD"))
    }
}

tasks {
    named("jar") {
        finalizedBy("copy")
    }
}
