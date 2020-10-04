package com.gsas.model;

public class SchemeDocumentsVO {
	
	private long schemeDocumentsId;
	private SchemeVO schemeVO;
	private DocumentVO documentVO;
	public SchemeDocumentsVO() {
		super();
	}
	public SchemeDocumentsVO(long schemeDocumentsId, SchemeVO schemeVO, DocumentVO documentVO) {
		super();
		this.schemeDocumentsId = schemeDocumentsId;
		this.schemeVO = schemeVO;
		this.documentVO = documentVO;
	}
	public long getSchemeDocumentsId() {
		return schemeDocumentsId;
	}
	public void setSchemeDocumentsId(long schemeDocumentsId) {
		this.schemeDocumentsId = schemeDocumentsId;
	}
	public SchemeVO getSchemeVO() {
		return schemeVO;
	}
	public void setSchemeVO(SchemeVO schemeVO) {
		this.schemeVO = schemeVO;
	}
	public DocumentVO getDocumentVO() {
		return documentVO;
	}
	public void setDocumentVO(DocumentVO documentVO) {
		this.documentVO = documentVO;
	}
	@Override
	public String toString() {
		return "SchemeDocuments [schemeDocumentsId=" + schemeDocumentsId + ", schemeVO=" + schemeVO + ", documentVO="
				+ documentVO + "]";
	}
	
}
