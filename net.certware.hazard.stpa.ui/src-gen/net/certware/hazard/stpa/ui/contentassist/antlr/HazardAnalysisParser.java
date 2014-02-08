/*
* generated by Xtext
*/
package net.certware.hazard.stpa.ui.contentassist.antlr;

import java.util.Collection;
import java.util.Map;
import java.util.HashMap;

import org.antlr.runtime.RecognitionException;
import org.eclipse.xtext.AbstractElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.AbstractContentAssistParser;
import org.eclipse.xtext.ui.editor.contentassist.antlr.FollowElement;
import org.eclipse.xtext.ui.editor.contentassist.antlr.internal.AbstractInternalContentAssistParser;

import com.google.inject.Inject;

import net.certware.hazard.stpa.services.HazardAnalysisGrammarAccess;

public class HazardAnalysisParser extends AbstractContentAssistParser {
	
	@Inject
	private HazardAnalysisGrammarAccess grammarAccess;
	
	private Map<AbstractElement, String> nameMappings;
	
	@Override
	protected net.certware.hazard.stpa.ui.contentassist.antlr.internal.InternalHazardAnalysisParser createParser() {
		net.certware.hazard.stpa.ui.contentassist.antlr.internal.InternalHazardAnalysisParser result = new net.certware.hazard.stpa.ui.contentassist.antlr.internal.InternalHazardAnalysisParser(null);
		result.setGrammarAccess(grammarAccess);
		return result;
	}
	
	@Override
	protected String getRuleName(AbstractElement element) {
		if (nameMappings == null) {
			nameMappings = new HashMap<AbstractElement, String>() {
				private static final long serialVersionUID = 1L;
				{
					put(grammarAccess.getRankingAccess().getAlternatives(), "rule__Ranking__Alternatives");
					put(grammarAccess.getModelAccess().getGroup(), "rule__Model__Group__0");
					put(grammarAccess.getAccidentAccess().getGroup(), "rule__Accident__Group__0");
					put(grammarAccess.getIncidentAccess().getGroup(), "rule__Incident__Group__0");
					put(grammarAccess.getRankingAccess().getGroup_0(), "rule__Ranking__Group_0__0");
					put(grammarAccess.getRankingAccess().getGroup_1(), "rule__Ranking__Group_1__0");
					put(grammarAccess.getHazardAccess().getGroup(), "rule__Hazard__Group__0");
					put(grammarAccess.getRiskLevelAccess().getGroup(), "rule__RiskLevel__Group__0");
					put(grammarAccess.getHazardLevelAccess().getGroup(), "rule__HazardLevel__Group__0");
					put(grammarAccess.getHazardExposureAccess().getGroup(), "rule__HazardExposure__Group__0");
					put(grammarAccess.getHazardAccidentLikelihoodAccess().getGroup(), "rule__HazardAccidentLikelihood__Group__0");
					put(grammarAccess.getConstraintAccess().getGroup(), "rule__Constraint__Group__0");
					put(grammarAccess.getRequirementAccess().getGroup(), "rule__Requirement__Group__0");
					put(grammarAccess.getDesignAccess().getGroup(), "rule__Design__Group__0");
					put(grammarAccess.getDesignAccess().getGroup_2(), "rule__Design__Group_2__0");
					put(grammarAccess.getDesignAccess().getGroup_3(), "rule__Design__Group_3__0");
					put(grammarAccess.getScenarioAccess().getGroup(), "rule__Scenario__Group__0");
					put(grammarAccess.getControlAccess().getGroup(), "rule__Control__Group__0");
					put(grammarAccess.getNoteAccess().getGroup(), "rule__Note__Group__0");
					put(grammarAccess.getModelAccess().getAccidentsAssignment_0(), "rule__Model__AccidentsAssignment_0");
					put(grammarAccess.getModelAccess().getIndicentsAssignment_1(), "rule__Model__IndicentsAssignment_1");
					put(grammarAccess.getAccidentAccess().getDescAssignment_1(), "rule__Accident__DescAssignment_1");
					put(grammarAccess.getAccidentAccess().getRankingAssignment_3(), "rule__Accident__RankingAssignment_3");
					put(grammarAccess.getAccidentAccess().getHazardsAssignment_4(), "rule__Accident__HazardsAssignment_4");
					put(grammarAccess.getAccidentAccess().getNotesAssignment_5(), "rule__Accident__NotesAssignment_5");
					put(grammarAccess.getIncidentAccess().getDescAssignment_1(), "rule__Incident__DescAssignment_1");
					put(grammarAccess.getIncidentAccess().getRankingAssignment_3(), "rule__Incident__RankingAssignment_3");
					put(grammarAccess.getIncidentAccess().getHazardsAssignment_4(), "rule__Incident__HazardsAssignment_4");
					put(grammarAccess.getIncidentAccess().getNotesAssignment_5(), "rule__Incident__NotesAssignment_5");
					put(grammarAccess.getHazardAccess().getDescAssignment_1(), "rule__Hazard__DescAssignment_1");
					put(grammarAccess.getHazardAccess().getLevelAssignment_3(), "rule__Hazard__LevelAssignment_3");
					put(grammarAccess.getHazardAccess().getRiskAssignment_4(), "rule__Hazard__RiskAssignment_4");
					put(grammarAccess.getHazardAccess().getConstraintsAssignment_5(), "rule__Hazard__ConstraintsAssignment_5");
					put(grammarAccess.getRiskLevelAccess().getExposureAssignment_2(), "rule__RiskLevel__ExposureAssignment_2");
					put(grammarAccess.getRiskLevelAccess().getLikelihoodAssignment_3(), "rule__RiskLevel__LikelihoodAssignment_3");
					put(grammarAccess.getHazardLevelAccess().getSeverityAssignment_1(), "rule__HazardLevel__SeverityAssignment_1");
					put(grammarAccess.getHazardLevelAccess().getLikelihoodAssignment_3(), "rule__HazardLevel__LikelihoodAssignment_3");
					put(grammarAccess.getHazardExposureAccess().getExposureAssignment_1(), "rule__HazardExposure__ExposureAssignment_1");
					put(grammarAccess.getHazardAccidentLikelihoodAccess().getLikelihoodAssignment_1(), "rule__HazardAccidentLikelihood__LikelihoodAssignment_1");
					put(grammarAccess.getHazardSeverityAccess().getValueAssignment(), "rule__HazardSeverity__ValueAssignment");
					put(grammarAccess.getHazardLikelihoodAccess().getValueAssignment(), "rule__HazardLikelihood__ValueAssignment");
					put(grammarAccess.getConstraintAccess().getConstraintAssignment_1(), "rule__Constraint__ConstraintAssignment_1");
					put(grammarAccess.getConstraintAccess().getRequirementsAssignment_3(), "rule__Constraint__RequirementsAssignment_3");
					put(grammarAccess.getConstraintAccess().getScenariosAssignment_4(), "rule__Constraint__ScenariosAssignment_4");
					put(grammarAccess.getConstraintAccess().getControlsAssignment_5(), "rule__Constraint__ControlsAssignment_5");
					put(grammarAccess.getConstraintAccess().getNotesAssignment_6(), "rule__Constraint__NotesAssignment_6");
					put(grammarAccess.getRequirementAccess().getRequirementAssignment_1(), "rule__Requirement__RequirementAssignment_1");
					put(grammarAccess.getRequirementAccess().getDesignsAssignment_3(), "rule__Requirement__DesignsAssignment_3");
					put(grammarAccess.getRequirementAccess().getNotesAssignment_4(), "rule__Requirement__NotesAssignment_4");
					put(grammarAccess.getDesignAccess().getAllocationAssignment_1(), "rule__Design__AllocationAssignment_1");
					put(grammarAccess.getDesignAccess().getAnalysisAssignment_2_1(), "rule__Design__AnalysisAssignment_2_1");
					put(grammarAccess.getDesignAccess().getRationaleAssignment_3_1(), "rule__Design__RationaleAssignment_3_1");
					put(grammarAccess.getScenarioAccess().getScenarioAssignment_1(), "rule__Scenario__ScenarioAssignment_1");
					put(grammarAccess.getControlAccess().getControlAssignment_1(), "rule__Control__ControlAssignment_1");
					put(grammarAccess.getNoteAccess().getNoteAssignment_1(), "rule__Note__NoteAssignment_1");
				}
			};
		}
		return nameMappings.get(element);
	}
	
	@Override
	protected Collection<FollowElement> getFollowElements(AbstractInternalContentAssistParser parser) {
		try {
			net.certware.hazard.stpa.ui.contentassist.antlr.internal.InternalHazardAnalysisParser typedParser = (net.certware.hazard.stpa.ui.contentassist.antlr.internal.InternalHazardAnalysisParser) parser;
			typedParser.entryRuleModel();
			return typedParser.getFollowElements();
		} catch(RecognitionException ex) {
			throw new RuntimeException(ex);
		}		
	}
	
	@Override
	protected String[] getInitialHiddenTokens() {
		return new String[] { "RULE_WS", "RULE_ML_COMMENT", "RULE_SL_COMMENT" };
	}
	
	public HazardAnalysisGrammarAccess getGrammarAccess() {
		return this.grammarAccess;
	}
	
	public void setGrammarAccess(HazardAnalysisGrammarAccess grammarAccess) {
		this.grammarAccess = grammarAccess;
	}
}
