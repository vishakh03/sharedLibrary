def call() {
  //if (env.BRANCH_NAME == 'main') {
  bat 'dotnet test --configuration Release --no-build --no-restore'
  // } else {
  //  bat 'dotnet test --configuration Release --no-restore --no-build --logger:"junit;LogFilePath=smswebapp.tests/smswebapp.tests/TestResults/test-results.xml"'
  // }
}
