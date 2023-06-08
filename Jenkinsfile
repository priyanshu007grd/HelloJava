pipeline {
    agent any
    stages {
        stage("Build"){
            steps {
                dir("simple-java-maven-app") {
                    sh "mvn clean install"
                }
            }
        }
        stage("Test"){
            steps {
                dir("simple-java-maven-app") {
                    sh "mvn test"
                }
            }
        }
    }
}