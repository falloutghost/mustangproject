package org.mustangproject.ZUGFeRD.entity;

import java.util.Date;

public interface IReferencedDocument {

	public String getIssuerAssignedId();

	public String getUrl();

	public String getName();

	public Date getIssuedAt();

	public Integer getTypeCode();

}
