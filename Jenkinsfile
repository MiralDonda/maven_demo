node {
  stage('SCM') {
    git 'https://github.com/MiralDonda/maven_demo.git'
  }
  
    stage("SonarQube Quality Gate") { 
      withSonarQubeEnv('sonar'){
        timeout(time: 1, unit: 'HOURS') { 
           def qg = waitForQualityGate() 
           if (qg.status != 'OK') {
             error "Pipeline aborted due to quality gate failure: ${qg.status}"
           }
        }
    }
}
}
