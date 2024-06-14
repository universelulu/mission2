pipeline{
  agent any

  stages{
    stage('Checkout'){
      steps{
        // 소스코드 체크아웃
        git 'https://github.com/universelulu/mission2.git'
      }
    }
    stage('Build'){
      steps{
        bat 'javac -encoding UTF-8 -d ./build homework/src/homework/*.java'
     }
    }
  }

  post{
    success{
      echo 'Build successful!'
    }
    failure{
      echo 'Build failed!'
    }
  }
}

    
    
    
