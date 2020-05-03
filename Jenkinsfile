pipeline {
    agent any 
    stages {
        stage('clean and compile') { 
            steps {
                sh "mvn clean"
                sh "mvn compile"
            }
        }
        stage('Test') { 
            steps {
                sh "mvn test"
            }
        }
        stage('package') { 
            steps {
                sh "mvn package"
            }
        }
        stage('build-docker-image') { 
            steps {
                sh "docker build -t strangerthug/calc:latest ."
            }
        }
    }
}
