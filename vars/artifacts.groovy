def call() {
  archiveArtifacts artifacts: 'publish/**', fingerprint: true
}
