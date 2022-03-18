package controller;

import model.PetModel;
import model.dto.Pet;
import view.SuccessView;
import view.FailView;

public class PetController {

	//주인 이름이 맞으면 Successview에 pet의 정보를 띄워줌
	//주인 이름을 받아서 PetModel의 petOne 메소드를 호출하는 메소드 petOneCalling
	public static void petOneCalling(String owner) {
		try { 
			Pet p = PetModel.petOne(owner);
			
			//애완견 접종이 완료되었는지의 여부도 알려줌
			if (p.getVaccine() == 'y') {
				System.out.println(owner + "님은 접종 완료된 애완견을 가졌습니다.");
			} else {
				System.out.println(owner + "님의 애완견은 접종이 필요합니다.");
			}
			System.out.println(owner + "님의 애완견 정보를 띄웁니다 : ");
			SuccessView.printPet(p);
			
		} catch (Exception e) {
			e.printStackTrace();
			FailView.messageView(e.getMessage());
		}
	}
}
