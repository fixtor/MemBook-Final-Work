package Base;

import Controller.IContactList;

public class VkontakteIContact<T> implements IContactList<T> {

	T vkId;

	public VkontakteIContact(T vkId) {
		this.vkId = vkId;
	}

	@Override
	public T getContact() {
	 return this.vkId;
	}

	@Override
	public String toString() {
		return "ID VK: " + vkId;
	}
}
