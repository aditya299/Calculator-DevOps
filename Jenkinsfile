pipeline {
    agent any 
    stages {
        stage('clone repo and clean') { 
            steps {
                sh "rm -rf calculator-devops"
                sh "git clone https://github.com/aditya299/calculator-devops.git"
                sh "mvn clean -f calculator-devops"
            }
        }
        stage('Test') { 
            steps {
                sh "mvn test -f calculator-devops"
            }
        }
        stage('Deploy') { 
            steps {
                sh "mvn package -f calculator-devops"
            }
        }
    }
}