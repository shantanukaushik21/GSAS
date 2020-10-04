package com.gsas.model;

public class SchemeApplicantDocumentsVO {
	
	private long schemeApplicantDocumentsId;
	private SchemeApplicantVO schemeApplicantVO;
	private DocumentVO documentVO;
	private String documentPath;
	public SchemeApplicantDocumentsVO() {
		super();
	}
	public SchemeApplicantDocumentsVO(long schemeApplicantDocumentsId, SchemeApplicantVO schemeApplicantVO,
			DocumentVO documentVO, String documentPath) {
		super();
		this.schemeApplicantDocumentsId = schemeApplicantDocumentsId;
		this.schemeApplicantVO = schemeApplicantVO;
		this.documentVO = documentVO;
		this.documentPath = documentPath;
	}
	public long getSchemeApplicantDocumentsId() {
		return schemeApplicantDocumentsId;
	}
	public void setSchemeApplicantDocumentsId(long schemeApplicantDocumentsId) {
		this.schemeApplicantDocumentsId = schemeApplicantDocumentsId;
	}
	public SchemeApplicantVO getSchemeApplicantVO() {
		return schemeApplicantVO;
	}
	public void setSchemeApplicantVO(SchemeApplicantVO schemeApplicantVO) {
		this.schemeApplicantVO = schemeApplicantVO;
	}
	public DocumentVO getDocumentVO() {
		return documentVO;
	}
	public void setDocumentVO(DocumentVO documentVO) {
		this.documentVO = documentVO;
	}
	public String getDocumentPath() {
		return documentPath;
	}
	public void setDocumentPath(String documentPath) {
		this.documentPath = documentPath;
	}
	@Override
	public String toString() {
		return "SchemeApplicantDocumentsVO [schemeApplicantDocumentsId=" + schemeApplicantDocumentsId
				+ ", schemeApplicantVO=" + schemeApplicantVO + ", documentVO=" + documentVO + ", documentPath="
				+ documentPath + "]";
	}
	
}
