def call() {
  if (env.BRANCH_NAME == 'main') {
    success {
            echo '✅ Build, test, publish successful!'
        }
        failure {
            echo '❌ Something went wrong.'
        }
  } 
  else {
            if (fileExists('smswebapp.tests/smswebapp.tests/TestResults/test-results.xml')) {
                junit 'smswebapp.tests/smswebapp.tests/TestResults/test-results.xml' 
            } else {
                echo 'No test report files found.'
            }
  }
}
