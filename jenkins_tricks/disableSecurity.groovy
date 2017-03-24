import hudson.model.*
import jenkins.model.*

Thread.start {
    sleep 10000
    File securityInitFile = new File(Jenkins.instance.rootDir, 'badass-security-init')
    if(! securityInitFile.exists()) {
        Jenkins.instance.disableSecurity()
        securityInitFile.setText('initialized', 'UTF-8')
    }
}
