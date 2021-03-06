package burp;


public class BScanIssueFactory {

    public static BScanIssue create(IScanIssue scanIssue, IBurpExtenderCallbacks callbacks) {
        BScanIssue issue = new BScanIssue();
        IHttpService service = scanIssue.getHttpService();
        issue.messageType = "scanIssue";
        issue.url = scanIssue.getUrl().toString();
        issue.host = service.getHost();
        issue.port = service.getPort();
        issue.protocol = service.getProtocol();
        issue.name = scanIssue.getIssueName();
        issue.issueType = scanIssue.getIssueType();
        issue.severity = scanIssue.getSeverity();
        issue.confidence = scanIssue.getConfidence();
        issue.issueBackground = scanIssue.getIssueBackground();
        issue.remediationBackground = scanIssue.getRemediationBackground();
        issue.issueDetail = scanIssue.getIssueDetail();
        issue.remediationDetail = scanIssue.getRemediationDetail();
        issue.inScope = callbacks.isInScope(scanIssue.getUrl());
        return issue;
    }
}
