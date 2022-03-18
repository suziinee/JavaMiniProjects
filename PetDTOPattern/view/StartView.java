package view;

import controller.PetController;
import exception.PetInvalidateException;
import model.PetModel;
import model.dto.Pet;

public class StartView {

	public static void main(String[] args) {
		PetController.petOneCalling("수진");
		System.out.println();
		
		try {
			PetModel.create("혜경", new Pet("휴지", "시바견", 11, 'n'));
		} catch(PetInvalidateException e) {
			System.out.println(e.getMessage());
		}
		PetController.petOneCalling("혜경");
		
		System.out.println();
		PetModel.update("혜경", 'y');
		System.out.println("전체 정보 확인");
		System.out.println(PetModel.petAll());
		
		System.out.println();
		PetModel.delete("현오");
		System.out.println("전체 정보 확인");
		System.out.println(PetModel.petAll());
		
	}
}
