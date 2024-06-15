pipeline {
    agent any

    stages{
        stage('CheckOut')
        {
            steps{
                checkout scm
            }
        }
        stage('Build'){
            steps{
                mvn clean install
            }
        }
    }
}
