package Base;

import Model.ContactListInterface;

public class VkontakteContact<T> implements ContactListInterface<T> {

	T vkId;

	public VkontakteContact(T vkId) {
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
