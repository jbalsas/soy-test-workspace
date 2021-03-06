/**
 * Copyright (c) 2000-present Liferay, Inc. All rights reserved.
 *
 * This library is free software; you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License as published by the Free
 * Software Foundation; either version 2.1 of the License, or (at your option)
 * any later version.
 *
 * This library is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or FITNESS
 * FOR A PARTICULAR PURPOSE. See the GNU Lesser General Public License for more
 * details.
 */

package com.clavisit.clavisit.poc.ddl.images.model;

import aQute.bnd.annotation.ProviderType;

import com.liferay.expando.kernel.model.ExpandoBridge;

import com.liferay.portal.kernel.bean.AutoEscape;
import com.liferay.portal.kernel.model.BaseModel;
import com.liferay.portal.kernel.model.CacheModel;
import com.liferay.portal.kernel.model.GroupedModel;
import com.liferay.portal.kernel.model.ShardedModel;
import com.liferay.portal.kernel.model.StagedAuditedModel;
import com.liferay.portal.kernel.service.ServiceContext;

import java.io.Serializable;

import java.util.Date;

/**
 * The base model interface for the Image service. Represents a row in the &quot;IMS_Image&quot; database table, with each column mapped to a property of this class.
 *
 * <p>
 * This interface and its corresponding implementation {@link com.clavisit.clavisit.poc.ddl.images.model.impl.ImageModelImpl} exist only as a container for the default property accessors generated by ServiceBuilder. Helper methods and all application logic should be put in {@link com.clavisit.clavisit.poc.ddl.images.model.impl.ImageImpl}.
 * </p>
 *
 * @author Brian Wing Shun Chan
 * @see Image
 * @see com.clavisit.clavisit.poc.ddl.images.model.impl.ImageImpl
 * @see com.clavisit.clavisit.poc.ddl.images.model.impl.ImageModelImpl
 * @generated
 */
@ProviderType
public interface ImageModel extends BaseModel<Image>, GroupedModel, ShardedModel,
	StagedAuditedModel {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify or reference this interface directly. All methods that expect a image model instance should use the {@link Image} interface instead.
	 */

	/**
	 * Returns the primary key of this image.
	 *
	 * @return the primary key of this image
	 */
	public long getPrimaryKey();

	/**
	 * Sets the primary key of this image.
	 *
	 * @param primaryKey the primary key of this image
	 */
	public void setPrimaryKey(long primaryKey);

	/**
	 * Returns the uuid of this image.
	 *
	 * @return the uuid of this image
	 */
	@AutoEscape
	@Override
	public String getUuid();

	/**
	 * Sets the uuid of this image.
	 *
	 * @param uuid the uuid of this image
	 */
	@Override
	public void setUuid(String uuid);

	/**
	 * Returns the image ID of this image.
	 *
	 * @return the image ID of this image
	 */
	public long getImageId();

	/**
	 * Sets the image ID of this image.
	 *
	 * @param imageId the image ID of this image
	 */
	public void setImageId(long imageId);

	/**
	 * Returns the group ID of this image.
	 *
	 * @return the group ID of this image
	 */
	@Override
	public long getGroupId();

	/**
	 * Sets the group ID of this image.
	 *
	 * @param groupId the group ID of this image
	 */
	@Override
	public void setGroupId(long groupId);

	/**
	 * Returns the company ID of this image.
	 *
	 * @return the company ID of this image
	 */
	@Override
	public long getCompanyId();

	/**
	 * Sets the company ID of this image.
	 *
	 * @param companyId the company ID of this image
	 */
	@Override
	public void setCompanyId(long companyId);

	/**
	 * Returns the user ID of this image.
	 *
	 * @return the user ID of this image
	 */
	@Override
	public long getUserId();

	/**
	 * Sets the user ID of this image.
	 *
	 * @param userId the user ID of this image
	 */
	@Override
	public void setUserId(long userId);

	/**
	 * Returns the user uuid of this image.
	 *
	 * @return the user uuid of this image
	 */
	@Override
	public String getUserUuid();

	/**
	 * Sets the user uuid of this image.
	 *
	 * @param userUuid the user uuid of this image
	 */
	@Override
	public void setUserUuid(String userUuid);

	/**
	 * Returns the user name of this image.
	 *
	 * @return the user name of this image
	 */
	@AutoEscape
	@Override
	public String getUserName();

	/**
	 * Sets the user name of this image.
	 *
	 * @param userName the user name of this image
	 */
	@Override
	public void setUserName(String userName);

	/**
	 * Returns the create date of this image.
	 *
	 * @return the create date of this image
	 */
	@Override
	public Date getCreateDate();

	/**
	 * Sets the create date of this image.
	 *
	 * @param createDate the create date of this image
	 */
	@Override
	public void setCreateDate(Date createDate);

	/**
	 * Returns the modified date of this image.
	 *
	 * @return the modified date of this image
	 */
	@Override
	public Date getModifiedDate();

	/**
	 * Sets the modified date of this image.
	 *
	 * @param modifiedDate the modified date of this image
	 */
	@Override
	public void setModifiedDate(Date modifiedDate);

	/**
	 * Returns the file name of this image.
	 *
	 * @return the file name of this image
	 */
	@AutoEscape
	public String getFileName();

	/**
	 * Sets the file name of this image.
	 *
	 * @param fileName the file name of this image
	 */
	public void setFileName(String fileName);

	/**
	 * Returns the description of this image.
	 *
	 * @return the description of this image
	 */
	@AutoEscape
	public String getDescription();

	/**
	 * Sets the description of this image.
	 *
	 * @param description the description of this image
	 */
	public void setDescription(String description);

	/**
	 * Returns the image path of this image.
	 *
	 * @return the image path of this image
	 */
	@AutoEscape
	public String getImagePath();

	/**
	 * Sets the image path of this image.
	 *
	 * @param imagePath the image path of this image
	 */
	public void setImagePath(String imagePath);

	/**
	 * Returns the thumbnail path of this image.
	 *
	 * @return the thumbnail path of this image
	 */
	@AutoEscape
	public String getThumbnailPath();

	/**
	 * Sets the thumbnail path of this image.
	 *
	 * @param thumbnailPath the thumbnail path of this image
	 */
	public void setThumbnailPath(String thumbnailPath);

	/**
	 * Returns the file ending of this image.
	 *
	 * @return the file ending of this image
	 */
	@AutoEscape
	public String getFileEnding();

	/**
	 * Sets the file ending of this image.
	 *
	 * @param fileEnding the file ending of this image
	 */
	public void setFileEnding(String fileEnding);

	/**
	 * Returns the mime type of this image.
	 *
	 * @return the mime type of this image
	 */
	@AutoEscape
	public String getMimeType();

	/**
	 * Sets the mime type of this image.
	 *
	 * @param mimeType the mime type of this image
	 */
	public void setMimeType(String mimeType);

	@Override
	public boolean isNew();

	@Override
	public void setNew(boolean n);

	@Override
	public boolean isCachedModel();

	@Override
	public void setCachedModel(boolean cachedModel);

	@Override
	public boolean isEscapedModel();

	@Override
	public Serializable getPrimaryKeyObj();

	@Override
	public void setPrimaryKeyObj(Serializable primaryKeyObj);

	@Override
	public ExpandoBridge getExpandoBridge();

	@Override
	public void setExpandoBridgeAttributes(BaseModel<?> baseModel);

	@Override
	public void setExpandoBridgeAttributes(ExpandoBridge expandoBridge);

	@Override
	public void setExpandoBridgeAttributes(ServiceContext serviceContext);

	@Override
	public Object clone();

	@Override
	public int compareTo(Image image);

	@Override
	public int hashCode();

	@Override
	public CacheModel<Image> toCacheModel();

	@Override
	public Image toEscapedModel();

	@Override
	public Image toUnescapedModel();

	@Override
	public String toString();

	@Override
	public String toXmlString();
}