pipeline {
    agent any

    stages {

        stage('Build Maven') {
            steps {
                bat 'mvn clean package -DskipTests'
            }
        }

        stage('Build Docker Image') {
            steps {
                bat 'docker build -t springboot-app .'
            }
        }

        stage('Stop Old Container') {
            steps {
                bat 'docker rm -f springboot-app'
            }
        }

        stage('Run Container') {
            steps {
                bat 'docker run -d --name springboot-app -p 8443:8443 springboot-app'
            }
        }
    }
}
