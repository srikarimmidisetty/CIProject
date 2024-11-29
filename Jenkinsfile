pipeline {
    agent any
    tools {
        maven 'Maven_3.9.9'
    }
    stages {
        /*stage('Checkout Code') {
            steps {
                git 'https://github.com/srikarimmidisetty/CIProject.git'
            }
        }*/
        stage('Build with Maven') {
            steps {
                sh 'mvn clean package'
            }
        }
        stage('Run Unit Tests') {
            steps {
                sh 'mvn test'
            }
        }
        stage('Integration Tests') {
            steps {
                sh 'mvn verify -P integration-tests'
            }
        }
        stage('Code Coverage') {
            steps {
                sh 'mvn test'
                archiveArtifacts artifacts: 'target/site/jacoco/index.html', allowEmptyArchive: true
            }
        }
        stage('Static Code Analysis') {
            steps {
                sh 'mvn checkstyle:checkstyle'
                archiveArtifacts artifacts: 'target/site/checkstyle.html', allowEmptyArchive: true
            }
        }/*
        stage('SonarQube Analysis') {
            steps {
                withSonarQubeEnv('SonarQube') {
                    sh 'mvn sonar:sonar'
                }
            }
        }*/
    }
    post {
        always {
            archiveArtifacts artifacts: '**/target/*.jar', allowEmptyArchive: true
        }
    }
}
