pipeline {
    agent any

    //tools {
    //Put required tools here
       //JDK '11'
       //maven 'MAVEN VERSION WHATEVER'
    //}
    //options {
        // Timeout counter starts AFTER agent is allocated
        //timeout(time: 25, unit: 'SECONDS')
    //}
    stages {
        stage('Build') {
            steps {
                withMaven() {
                    sh "mvn clean install"
                }
            }
        }
    }

   post {
        success {
            recordCoverage qualityGates: [[metric: 'LINE', threshold: 70.0]], tools: [[pattern: '**/jacoco.xml']]
        }
   }
}

