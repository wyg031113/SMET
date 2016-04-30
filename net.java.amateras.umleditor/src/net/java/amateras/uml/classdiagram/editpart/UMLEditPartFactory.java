package net.java.amateras.uml.classdiagram.editpart;

import net.java.amateras.uml.classdiagram.model.AggregationModel;
import net.java.amateras.uml.classdiagram.model.AssociationModel;
import net.java.amateras.uml.classdiagram.model.AttributeModel;
import net.java.amateras.uml.classdiagram.model.ClassModel;
import net.java.amateras.uml.classdiagram.model.CompositeModel;
import net.java.amateras.uml.classdiagram.model.GeneralizationModel;

import net.java.amateras.uml.classdiagram.model.RealizationModel;
import net.java.amateras.uml.editpart.BaseUMLEditPartFactory;
import net.java.amateras.uml.editpart.RootEditPart;
import net.java.amateras.uml.model.RootModel;

import org.eclipse.gef.EditPart;

/**
 * EditPart�̃t�@�N�g���N���X�B
 * ���f���̌^�ɉ����Ĉȉ���EditPart�̃C���X�^���X�𐶐����ĕԋp���܂��B
 * <ul>
 *   <li>RootModel -&gt; RootEditPart</li>
 *   <li>ClassModel -&gt; ClassEditPart</li>
 *   <li>InterfaceModel -&gt; InterfaceEditPart</li>
 *   <li>DependencyModel -&gt; DependencyEditPart</li>
 *   <li>AggregationModel -&gt; AggregationEditPart</li>
 *   <li>CompositeModel -&gt; CompositeEditPart</li>
 *   <li>GeneralizationModel -&gt; GeneralizationEditPart</li>
 *   <li>RealizationModel -&gt; RealizationEditPart</li>
 * </ul>
 * 
 * @author Naoki Takezoe
 */
public class UMLEditPartFactory extends BaseUMLEditPartFactory {

	protected EditPart createUMLEditPart(EditPart context, Object model) {
		EditPart part = null;
		if(model instanceof RootModel){
			return new RootEditPart();
		} else if(model instanceof ClassModel){
			return new ClassEditPart();
		}  else if(model instanceof CompositeModel){
			return new CompositeEditPart();
		}  else if(model instanceof GeneralizationModel){
			return new GeneralizationEditPart();
		} else if(model instanceof RealizationModel){
			return new RealizationEditPart();
		} else if(model instanceof AttributeModel){
			return new AttributeEditPart();
		} 
		return part;
	}
	
}