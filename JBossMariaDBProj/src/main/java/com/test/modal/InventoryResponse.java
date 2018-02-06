package com.test.modal;

import java.io.Serializable;

public class InventoryResponse implements Serializable{
	 
    private String  messageId;
    private int returnCode;
    private String comment;
	public String getMessageId() {
		return messageId;
	}
	public void setMessageId(String messageId) {
		this.messageId = messageId;
	}
	public int getReturnCode() {
		return returnCode;
	}
	public void setReturnCode(int returnCode) {
		this.returnCode = returnCode;
	}
	public String getComment() {
		return comment;
	}
	public void setComment(String comment) {
		this.comment = comment;
	}
	@Override
	public String toString() {
		return "InventoryResponse [messageId=" + messageId + ", returnCode=" + returnCode + ", comment=" + comment
				+ "]";
	}
}
