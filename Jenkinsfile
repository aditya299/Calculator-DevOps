pipeline {
	environment {
    	registry = "strangerthug/calc"
    	registryCredential = 'dockerhub-creds'
    	dockerImage = ''
  }
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
         stage('Building image') {
      		steps {
        		script {
          			dockerImage = docker.build registry + ":latest"
        		}
      		}
    	}
    	stage('Deploy Image') {
      		steps {
        		script {
          			docker.withRegistry( '', registryCredential ) {
            		dockerImage.push()
          			}
        		}
      		}
    	}
    	stage('Trigger Rundeck'){
    		steps {
    			build 	'rundeck-test'
    		}
    	}
    }
}
