/*
 * generated by Xtext
 */
package com.nagarro.serializer;

import com.google.inject.Inject;
import com.google.inject.Provider;
import com.nagarro.appBuilderDSL.AppBuilder;
import com.nagarro.appBuilderDSL.AppBuilderDSLPackage;
import com.nagarro.appBuilderDSL.Attribute;
import com.nagarro.appBuilderDSL.Business;
import com.nagarro.appBuilderDSL.Button;
import com.nagarro.appBuilderDSL.CompositeConditionExpression;
import com.nagarro.appBuilderDSL.CompositeScreen;
import com.nagarro.appBuilderDSL.Condition;
import com.nagarro.appBuilderDSL.ControlValue;
import com.nagarro.appBuilderDSL.Controller;
import com.nagarro.appBuilderDSL.DataType;
import com.nagarro.appBuilderDSL.DynamicValue;
import com.nagarro.appBuilderDSL.Entity;
import com.nagarro.appBuilderDSL.EntryParameters;
import com.nagarro.appBuilderDSL.EnumDataBinding;
import com.nagarro.appBuilderDSL.ExecuteAction;
import com.nagarro.appBuilderDSL.Expression;
import com.nagarro.appBuilderDSL.Feature;
import com.nagarro.appBuilderDSL.GridLayout;
import com.nagarro.appBuilderDSL.Import;
import com.nagarro.appBuilderDSL.InitAction;
import com.nagarro.appBuilderDSL.InstanceService;
import com.nagarro.appBuilderDSL.Label;
import com.nagarro.appBuilderDSL.List;
import com.nagarro.appBuilderDSL.Main;
import com.nagarro.appBuilderDSL.Model;
import com.nagarro.appBuilderDSL.NamespaceDeclation;
import com.nagarro.appBuilderDSL.Navigate;
import com.nagarro.appBuilderDSL.RestCall;
import com.nagarro.appBuilderDSL.RowLayout;
import com.nagarro.appBuilderDSL.ScreenLayout;
import com.nagarro.appBuilderDSL.SetInstruction;
import com.nagarro.appBuilderDSL.SetInstructionAssignment;
import com.nagarro.appBuilderDSL.SimpleConditionExpression;
import com.nagarro.appBuilderDSL.SimpleDataBinding;
import com.nagarro.appBuilderDSL.SimpleScreen;
import com.nagarro.appBuilderDSL.Text;
import com.nagarro.appBuilderDSL.Ui;
import com.nagarro.appBuilderDSL.UiAction;
import com.nagarro.appBuilderDSL.UiListenerBinding;
import com.nagarro.appBuilderDSL.ValidationBinding;
import com.nagarro.appBuilderDSL.Validator;
import com.nagarro.appBuilderDSL.Value;
import com.nagarro.appBuilderDSL.View;
import com.nagarro.services.AppBuilderDSLGrammarAccess;
import org.eclipse.emf.ecore.EObject;
import org.eclipse.xtext.serializer.acceptor.ISemanticSequenceAcceptor;
import org.eclipse.xtext.serializer.acceptor.SequenceFeeder;
import org.eclipse.xtext.serializer.diagnostic.ISemanticSequencerDiagnosticProvider;
import org.eclipse.xtext.serializer.diagnostic.ISerializationDiagnostic.Acceptor;
import org.eclipse.xtext.serializer.sequencer.AbstractDelegatingSemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.GenericSequencer;
import org.eclipse.xtext.serializer.sequencer.ISemanticNodeProvider.INodesForEObjectProvider;
import org.eclipse.xtext.serializer.sequencer.ISemanticSequencer;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService;
import org.eclipse.xtext.serializer.sequencer.ITransientValueService.ValueTransient;

@SuppressWarnings("all")
public class AppBuilderDSLSemanticSequencer extends AbstractDelegatingSemanticSequencer {

	@Inject
	private AppBuilderDSLGrammarAccess grammarAccess;
	
	@Override
	public void createSequence(EObject context, EObject semanticObject) {
		if(semanticObject.eClass().getEPackage() == AppBuilderDSLPackage.eINSTANCE) switch(semanticObject.eClass().getClassifierID()) {
			case AppBuilderDSLPackage.APP_BUILDER:
				sequence_AppBuilder(context, (AppBuilder) semanticObject); 
				return; 
			case AppBuilderDSLPackage.ATTRIBUTE:
				sequence_Attribute(context, (Attribute) semanticObject); 
				return; 
			case AppBuilderDSLPackage.BUSINESS:
				sequence_Business(context, (Business) semanticObject); 
				return; 
			case AppBuilderDSLPackage.BUTTON:
				sequence_Button(context, (Button) semanticObject); 
				return; 
			case AppBuilderDSLPackage.COMPOSITE_CONDITION_EXPRESSION:
				sequence_CompositeConditionExpression(context, (CompositeConditionExpression) semanticObject); 
				return; 
			case AppBuilderDSLPackage.COMPOSITE_SCREEN:
				sequence_CompositeScreen(context, (CompositeScreen) semanticObject); 
				return; 
			case AppBuilderDSLPackage.CONDITION:
				sequence_Condition(context, (Condition) semanticObject); 
				return; 
			case AppBuilderDSLPackage.CONTROL_VALUE:
				sequence_ControlValue(context, (ControlValue) semanticObject); 
				return; 
			case AppBuilderDSLPackage.CONTROLLER:
				sequence_Controller(context, (Controller) semanticObject); 
				return; 
			case AppBuilderDSLPackage.DATA_TYPE:
				sequence_DataType(context, (DataType) semanticObject); 
				return; 
			case AppBuilderDSLPackage.DYNAMIC_VALUE:
				sequence_DynamicValue(context, (DynamicValue) semanticObject); 
				return; 
			case AppBuilderDSLPackage.ENTITY:
				sequence_Entity(context, (Entity) semanticObject); 
				return; 
			case AppBuilderDSLPackage.ENTRY_PARAMETERS:
				sequence_EntryParameters(context, (EntryParameters) semanticObject); 
				return; 
			case AppBuilderDSLPackage.ENUM_DATA_BINDING:
				sequence_EnumDataBinding(context, (EnumDataBinding) semanticObject); 
				return; 
			case AppBuilderDSLPackage.EXECUTE_ACTION:
				sequence_ExecuteAction(context, (ExecuteAction) semanticObject); 
				return; 
			case AppBuilderDSLPackage.EXPRESSION:
				sequence_Expression(context, (Expression) semanticObject); 
				return; 
			case AppBuilderDSLPackage.FEATURE:
				sequence_Feature(context, (Feature) semanticObject); 
				return; 
			case AppBuilderDSLPackage.GRID_LAYOUT:
				if(context == grammarAccess.getGridLayoutRule()) {
					sequence_GridLayout(context, (GridLayout) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getControlRule() ||
				   context == grammarAccess.getLayoutRule()) {
					sequence_GridLayout_Layout(context, (GridLayout) semanticObject); 
					return; 
				}
				else break;
			case AppBuilderDSLPackage.IMPORT:
				sequence_Import(context, (Import) semanticObject); 
				return; 
			case AppBuilderDSLPackage.INIT_ACTION:
				sequence_InitAction(context, (InitAction) semanticObject); 
				return; 
			case AppBuilderDSLPackage.INSTANCE_SERVICE:
				sequence_InstanceService(context, (InstanceService) semanticObject); 
				return; 
			case AppBuilderDSLPackage.LABEL:
				sequence_Label(context, (Label) semanticObject); 
				return; 
			case AppBuilderDSLPackage.LIST:
				sequence_List(context, (List) semanticObject); 
				return; 
			case AppBuilderDSLPackage.MAIN:
				sequence_Main(context, (Main) semanticObject); 
				return; 
			case AppBuilderDSLPackage.MODEL:
				sequence_Model(context, (Model) semanticObject); 
				return; 
			case AppBuilderDSLPackage.NAMESPACE_DECLATION:
				sequence_NamespaceDeclation(context, (NamespaceDeclation) semanticObject); 
				return; 
			case AppBuilderDSLPackage.NAVIGATE:
				sequence_Navigate(context, (Navigate) semanticObject); 
				return; 
			case AppBuilderDSLPackage.REST_CALL:
				sequence_RestCall(context, (RestCall) semanticObject); 
				return; 
			case AppBuilderDSLPackage.ROW_LAYOUT:
				if(context == grammarAccess.getControlRule() ||
				   context == grammarAccess.getLayoutRule()) {
					sequence_Layout_RowLayout(context, (RowLayout) semanticObject); 
					return; 
				}
				else if(context == grammarAccess.getRowLayoutRule()) {
					sequence_RowLayout(context, (RowLayout) semanticObject); 
					return; 
				}
				else break;
			case AppBuilderDSLPackage.SCREEN_LAYOUT:
				sequence_ScreenLayout(context, (ScreenLayout) semanticObject); 
				return; 
			case AppBuilderDSLPackage.SET_INSTRUCTION:
				sequence_SetInstruction(context, (SetInstruction) semanticObject); 
				return; 
			case AppBuilderDSLPackage.SET_INSTRUCTION_ASSIGNMENT:
				sequence_SetInstructionAssignment(context, (SetInstructionAssignment) semanticObject); 
				return; 
			case AppBuilderDSLPackage.SIMPLE_CONDITION_EXPRESSION:
				sequence_SimpleConditionExpression(context, (SimpleConditionExpression) semanticObject); 
				return; 
			case AppBuilderDSLPackage.SIMPLE_DATA_BINDING:
				sequence_SimpleDataBinding(context, (SimpleDataBinding) semanticObject); 
				return; 
			case AppBuilderDSLPackage.SIMPLE_SCREEN:
				sequence_SimpleScreen(context, (SimpleScreen) semanticObject); 
				return; 
			case AppBuilderDSLPackage.SYSTEM:
				sequence_System(context, (com.nagarro.appBuilderDSL.System) semanticObject); 
				return; 
			case AppBuilderDSLPackage.TEXT:
				sequence_Text(context, (Text) semanticObject); 
				return; 
			case AppBuilderDSLPackage.UI:
				sequence_Ui(context, (Ui) semanticObject); 
				return; 
			case AppBuilderDSLPackage.UI_ACTION:
				sequence_UiAction(context, (UiAction) semanticObject); 
				return; 
			case AppBuilderDSLPackage.UI_LISTENER_BINDING:
				sequence_UiListenerBinding(context, (UiListenerBinding) semanticObject); 
				return; 
			case AppBuilderDSLPackage.VALIDATION_BINDING:
				sequence_ValidationBinding(context, (ValidationBinding) semanticObject); 
				return; 
			case AppBuilderDSLPackage.VALIDATOR:
				sequence_Validator(context, (Validator) semanticObject); 
				return; 
			case AppBuilderDSLPackage.VALUE:
				sequence_Value(context, (Value) semanticObject); 
				return; 
			case AppBuilderDSLPackage.VIEW:
				sequence_View(context, (View) semanticObject); 
				return; 
			}
		if (errorAcceptor != null) errorAcceptor.accept(diagnosticProvider.createInvalidContextOrTypeDiagnostic(semanticObject, context));
	}
	
	/**
	 * Constraint:
	 *     elements+=AbstractElement*
	 */
	protected void sequence_AppBuilder(EObject context, AppBuilder semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID type=AttributeType)
	 */
	protected void sequence_Attribute(EObject context, Attribute semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.ATTRIBUTE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.ATTRIBUTE__NAME));
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.ATTRIBUTE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.ATTRIBUTE__TYPE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getAttributeAccess().getNameIDTerminalRuleCall_0_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getAttributeAccess().getTypeAttributeTypeParserRuleCall_2_0(), semanticObject.getType());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (elements+=Service*)
	 */
	protected void sequence_Business(EObject context, Business semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID cssStyle=Value? resourceKey=Value?)
	 */
	protected void sequence_Button(EObject context, Button semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conditions+=[Condition|ID] conditions+=[Condition|ID]*)
	 */
	protected void sequence_CompositeConditionExpression(EObject context, CompositeConditionExpression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID layouts+=Layout)
	 */
	protected void sequence_CompositeScreen(EObject context, CompositeScreen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID conditionExpression=ConditionExpression)
	 */
	protected void sequence_Condition(EObject context, Condition semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.CONDITION__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.CONDITION__NAME));
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.CONDITION__CONDITION_EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.CONDITION__CONDITION_EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getConditionAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getConditionAccess().getConditionExpressionConditionExpressionParserRuleCall_3_0(), semanticObject.getConditionExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (control=[Control|ID] controlAccess=QualifiedName?)
	 */
	protected void sequence_ControlValue(EObject context, ControlValue semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (initAction=InitAction validator=Validator? actions+=Action*)
	 */
	protected void sequence_Controller(EObject context, Controller semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=ID
	 */
	protected void sequence_DataType(EObject context, DataType semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.TYPE__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.TYPE__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDataTypeAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (variableName=ID type=AttributeType expression=Expression)
	 */
	protected void sequence_DynamicValue(EObject context, DynamicValue semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.DYNAMIC_VALUE__VARIABLE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.DYNAMIC_VALUE__VARIABLE_NAME));
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.DYNAMIC_VALUE__TYPE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.DYNAMIC_VALUE__TYPE));
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.DYNAMIC_VALUE__EXPRESSION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.DYNAMIC_VALUE__EXPRESSION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getDynamicValueAccess().getVariableNameIDTerminalRuleCall_1_0(), semanticObject.getVariableName());
		feeder.accept(grammarAccess.getDynamicValueAccess().getTypeAttributeTypeParserRuleCall_3_0(), semanticObject.getType());
		feeder.accept(grammarAccess.getDynamicValueAccess().getExpressionExpressionParserRuleCall_5_0(), semanticObject.getExpression());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID superType=[Entity|QualifiedName]? features+=Feature*)
	 */
	protected void sequence_Entity(EObject context, Entity semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     attributes+=Attribute+
	 */
	protected void sequence_EntryParameters(EObject context, EntryParameters semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (enumClassName=STRING control=[Control|ID] controlAccess=QualifiedName?)
	 */
	protected void sequence_EnumDataBinding(EObject context, EnumDataBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     action=[Action|ID]
	 */
	protected void sequence_ExecuteAction(EObject context, ExecuteAction semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.EXECUTE_ACTION__ACTION) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.EXECUTE_ACTION__ACTION));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getExecuteActionAccess().getActionActionIDTerminalRuleCall_1_0_1(), semanticObject.getAction());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (terms+=ExpressionTerm terms+=ExpressionTerm*)
	 */
	protected void sequence_Expression(EObject context, Expression semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (many?='many'? name=ID type=[Type|QualifiedName])
	 */
	protected void sequence_Feature(EObject context, Feature semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='"grid"' columns=INT?)
	 */
	protected void sequence_GridLayout(EObject context, GridLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='"grid"' columns=INT? controls+=Control*)
	 */
	protected void sequence_GridLayout_Layout(EObject context, GridLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     importedNamespace=QualifiedNameWithWildcard
	 */
	protected void sequence_Import(EObject context, Import semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.IMPORT__IMPORTED_NAMESPACE) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.IMPORT__IMPORTED_NAMESPACE));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getImportAccess().getImportedNamespaceQualifiedNameWithWildcardParserRuleCall_1_0(), semanticObject.getImportedNamespace());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (databindings+=DataBinding* uiListenerBindingss+=UiListenerBinding* validationBindings+=ValidationBinding* instructions+=Instruction*)
	 */
	protected void sequence_InitAction(EObject context, InitAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     instanceName=QualifiedName
	 */
	protected void sequence_InstanceService(EObject context, InstanceService semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.INSTANCE_SERVICE__INSTANCE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.INSTANCE_SERVICE__INSTANCE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getInstanceServiceAccess().getInstanceNameQualifiedNameParserRuleCall_1_0(), semanticObject.getInstanceName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID resourceKey=Value?)
	 */
	protected void sequence_Label(EObject context, Label semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (type='"rowlayout"' controls+=Control*)
	 */
	protected void sequence_Layout_RowLayout(EObject context, RowLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID labelprovider=Value? cssStyle=Value? tooltip=Value?)
	 */
	protected void sequence_List(EObject context, List semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (
	 *         appName=STRING 
	 *         appVersion=STRING 
	 *         devices+=Device 
	 *         devices+=Device* 
	 *         screen=[Screen|ID] 
	 *         generalStyle=STRING?
	 *     )
	 */
	protected void sequence_Main(EObject context, Main semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (attributes+=Attribute*)
	 */
	protected void sequence_Model(EObject context, Model semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     name=QualifiedName
	 */
	protected void sequence_NamespaceDeclation(EObject context, NamespaceDeclation semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.ABSTRACT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.ABSTRACT_ELEMENT__NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getNamespaceDeclationAccess().getNameQualifiedNameParserRuleCall_1_0(), semanticObject.getName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (screen=[Screen|ID] params+=Parameters*)
	 */
	protected void sequence_Navigate(EObject context, Navigate semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     url=URL
	 */
	protected void sequence_RestCall(EObject context, RestCall semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.REST_CALL__URL) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.REST_CALL__URL));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getRestCallAccess().getUrlURLParserRuleCall_2_2_0(), semanticObject.getUrl());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     type='"rowlayout"'
	 */
	protected void sequence_RowLayout(EObject context, RowLayout semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     screen=[Screen|ID]
	 */
	protected void sequence_ScreenLayout(EObject context, ScreenLayout semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.SCREEN_LAYOUT__SCREEN) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.SCREEN_LAYOUT__SCREEN));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getScreenLayoutAccess().getScreenScreenIDTerminalRuleCall_1_0_1(), semanticObject.getScreen());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     {SetInstructionAssignment}
	 */
	protected void sequence_SetInstructionAssignment(EObject context, SetInstructionAssignment semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (model=[Attribute|ID] modelAccess=QualifiedName? assignment=SetInstructionAssignment)
	 */
	protected void sequence_SetInstruction(EObject context, SetInstruction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     variableName=ID
	 */
	protected void sequence_SimpleConditionExpression(EObject context, SimpleConditionExpression semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.SIMPLE_CONDITION_EXPRESSION__VARIABLE_NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.SIMPLE_CONDITION_EXPRESSION__VARIABLE_NAME));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSimpleConditionExpressionAccess().getVariableNameIDTerminalRuleCall_0_0(), semanticObject.getVariableName());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (model=[Attribute|ID] modelAccess=QualifiedName? control=[Control|ID] controlAccess=QualifiedName?)
	 */
	protected void sequence_SimpleDataBinding(EObject context, SimpleDataBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID entryParameters=EntryParameters? model=Model view=View controller=Controller)
	 */
	protected void sequence_SimpleScreen(EObject context, SimpleScreen semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID business=Business ui=Ui)
	 */
	protected void sequence_System(EObject context, com.nagarro.appBuilderDSL.System semanticObject) {
		if(errorAcceptor != null) {
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.ABSTRACT_ELEMENT__NAME) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.ABSTRACT_ELEMENT__NAME));
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.SYSTEM__BUSINESS) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.SYSTEM__BUSINESS));
			if(transientValues.isValueTransient(semanticObject, AppBuilderDSLPackage.Literals.SYSTEM__UI) == ValueTransient.YES)
				errorAcceptor.accept(diagnosticProvider.createFeatureValueMissing(semanticObject, AppBuilderDSLPackage.Literals.SYSTEM__UI));
		}
		INodesForEObjectProvider nodes = createNodeProvider(semanticObject);
		SequenceFeeder feeder = createSequencerFeeder(semanticObject, nodes);
		feeder.accept(grammarAccess.getSystemAccess().getNameIDTerminalRuleCall_1_0(), semanticObject.getName());
		feeder.accept(grammarAccess.getSystemAccess().getBusinessBusinessParserRuleCall_3_0(), semanticObject.getBusiness());
		feeder.accept(grammarAccess.getSystemAccess().getUiUiParserRuleCall_4_0(), semanticObject.getUi());
		feeder.finish();
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID cssStyle=Value? resourceKey=Value?)
	 */
	protected void sequence_Text(EObject context, Text semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (name=ID instructions+=Instruction+)
	 */
	protected void sequence_UiAction(EObject context, UiAction semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (action=[Action|ID] control=[Control|ID] controlAccess=QualifiedName?)
	 */
	protected void sequence_UiListenerBinding(EObject context, UiListenerBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (main=Main services+=Service* screens+=Screen*)
	 */
	protected void sequence_Ui(EObject context, Ui semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (condition=[Condition|ID] control=[Control|ID] controlAccess=QualifiedName?)
	 */
	protected void sequence_ValidationBinding(EObject context, ValidationBinding semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     (conditions+=Condition*)
	 */
	protected void sequence_Validator(EObject context, Validator semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     {Value}
	 */
	protected void sequence_Value(EObject context, Value semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
	
	
	/**
	 * Constraint:
	 *     layouts+=Layout
	 */
	protected void sequence_View(EObject context, View semanticObject) {
		genericSequencer.createSequence(context, semanticObject);
	}
}
