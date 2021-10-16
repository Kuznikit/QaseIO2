package pages;

import models.ProjectDetails;
import wrappers.DropDown;
import static com.codeborne.selenide.Selenide.$;

public class ProjectDetailsPage {
    public static String TITLE = "#title";

    public ProjectDetailsPage selectingDropDownFields(ProjectDetails projectDetails) {
        $(TITLE).sendKeys(projectDetails.getTitle());
        new DropDown("statusGroup").select(projectDetails.getStatus());
        //new DropDown("descriptionGroup").select(projectDetails.getDescription());
        new DropDown("suiteGroup").select(projectDetails.getSuite());
        new DropDown("severityGroup").select(projectDetails.getSeverity());
        new DropDown("priorityGroup").select(projectDetails.getPriority());
        new DropDown("typeGroup").select(projectDetails.getType());
        new DropDown("layerGroup").select(projectDetails.getLayer());
        new DropDown("is_flakyGroup").select(projectDetails.getIsFlaky());
        new DropDown("milestoneGroup").select(projectDetails.getMilestone());
        new DropDown("behaviorGroup").select(projectDetails.getBehavior());
        new DropDown("automationStatusGroup").select(projectDetails.getAutomationStatus());
        return this;

    }
}
