{"id":"aa958aa8-3925-44a2-bf7c-2192948de0a3","name":"src.BPD-taskform.frm","model":{"processName":"BPD","processId":"src.BPD","properties":[{"name":"event","typeInfo":{"type":"OBJECT","className":"com.myspace.events.eventBO","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":false}]}},{"name":"getInstanceId","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":false}]}},{"name":"mongo","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":false}]}},{"name":"result","typeInfo":{"type":"BASE","className":"java.lang.String","multiple":false},"metaData":{"entries":[{"name":"field-readOnly","value":false}]}}],"formModelType":"org.kie.workbench.common.forms.jbpm.model.authoring.process.BusinessProcessFormModel"},"fields":[{"nestedForm":"b9e24790-8065-4a86-89d2-96e95051c3f2","container":"FIELD_SET","id":"field_77415084548032E11","name":"event","label":"Event","required":false,"readOnly":false,"validateOnChange":true,"binding":"event","standaloneClassName":"com.myspace.events.eventBO","code":"SubForm","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.relations.subForm.definition.SubFormFieldDefinition"},{"maxLength":100,"placeHolder":"GetInstanceId","id":"field_1497663507771006E12","name":"getInstanceId","label":"GetInstanceId","required":false,"readOnly":false,"validateOnChange":true,"binding":"getInstanceId","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"maxLength":100,"placeHolder":"Mongo","id":"field_1468841179921216E11","name":"mongo","label":"Mongo","required":false,"readOnly":false,"validateOnChange":true,"binding":"mongo","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"},{"maxLength":100,"placeHolder":"Result","id":"field_192564759933936E11","name":"result","label":"Result","required":false,"readOnly":false,"validateOnChange":true,"binding":"result","standaloneClassName":"java.lang.String","code":"TextBox","serializedFieldClassName":"org.kie.workbench.common.forms.fields.shared.fieldTypes.basic.textBox.definition.TextBoxFieldDefinition"}],"layoutTemplate":{"version":2,"style":"FLUID","layoutProperties":{},"rows":[{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_77415084548032E11","form_id":"aa958aa8-3925-44a2-bf7c-2192948de0a3"}}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_1497663507771006E12","form_id":"aa958aa8-3925-44a2-bf7c-2192948de0a3"}}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_1468841179921216E11","form_id":"aa958aa8-3925-44a2-bf7c-2192948de0a3"}}]}]},{"properties":{},"layoutColumns":[{"span":"12","height":"12","properties":{},"rows":[],"layoutComponents":[{"dragTypeName":"org.kie.workbench.common.forms.editor.client.editor.rendering.EditorFieldLayoutComponent","properties":{"field_id":"field_192564759933936E11","form_id":"aa958aa8-3925-44a2-bf7c-2192948de0a3"}}]}]}]}}