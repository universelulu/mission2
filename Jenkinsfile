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
                bat 'javac -d bin homework/src/homework/*.java'
            }
        }
    }
}
