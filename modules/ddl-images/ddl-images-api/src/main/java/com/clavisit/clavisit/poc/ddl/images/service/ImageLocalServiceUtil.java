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

package com.clavisit.clavisit.poc.ddl.images.service;

import aQute.bnd.annotation.ProviderType;

import com.liferay.osgi.util.ServiceTrackerFactory;

import org.osgi.util.tracker.ServiceTracker;

/**
 * Provides the local service utility for Image. This utility wraps
 * {@link com.clavisit.clavisit.poc.ddl.images.service.impl.ImageLocalServiceImpl} and is the
 * primary access point for service operations in application layer code running
 * on the local server. Methods of this service will not have security checks
 * based on the propagated JAAS credentials because this service can only be
 * accessed from within the same VM.
 *
 * @author Brian Wing Shun Chan
 * @see ImageLocalService
 * @see com.clavisit.clavisit.poc.ddl.images.service.base.ImageLocalServiceBaseImpl
 * @see com.clavisit.clavisit.poc.ddl.images.service.impl.ImageLocalServiceImpl
 * @generated
 */
@ProviderType
public class ImageLocalServiceUtil {
	/*
	 * NOTE FOR DEVELOPERS:
	 *
	 * Never modify this class directly. Add custom service methods to {@link com.clavisit.clavisit.poc.ddl.images.service.impl.ImageLocalServiceImpl} and rerun ServiceBuilder to regenerate this class.
	 */

	/**
	* Adds the image to the database. Also notifies the appropriate model listeners.
	*
	* @param image the image
	* @return the image that was added
	*/
	public static com.clavisit.clavisit.poc.ddl.images.model.Image addImage(
		com.clavisit.clavisit.poc.ddl.images.model.Image image) {
		return getService().addImage(image);
	}

	/**
	* Creates a new image with the primary key. Does not add the image to the database.
	*
	* @param imageId the primary key for the new image
	* @return the new image
	*/
	public static com.clavisit.clavisit.poc.ddl.images.model.Image createImage(
		long imageId) {
		return getService().createImage(imageId);
	}

	/**
	* Deletes the image from the database. Also notifies the appropriate model listeners.
	*
	* @param image the image
	* @return the image that was removed
	*/
	public static com.clavisit.clavisit.poc.ddl.images.model.Image deleteImage(
		com.clavisit.clavisit.poc.ddl.images.model.Image image) {
		return getService().deleteImage(image);
	}

	/**
	* Deletes the image with the primary key from the database. Also notifies the appropriate model listeners.
	*
	* @param imageId the primary key of the image
	* @return the image that was removed
	* @throws PortalException if a image with the primary key could not be found
	*/
	public static com.clavisit.clavisit.poc.ddl.images.model.Image deleteImage(
		long imageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deleteImage(imageId);
	}

	public static com.clavisit.clavisit.poc.ddl.images.model.Image fetchImage(
		long imageId) {
		return getService().fetchImage(imageId);
	}

	/**
	* Returns the image matching the UUID and group.
	*
	* @param uuid the image's UUID
	* @param groupId the primary key of the group
	* @return the matching image, or <code>null</code> if a matching image could not be found
	*/
	public static com.clavisit.clavisit.poc.ddl.images.model.Image fetchImageByUuidAndGroupId(
		java.lang.String uuid, long groupId) {
		return getService().fetchImageByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Returns the image with the primary key.
	*
	* @param imageId the primary key of the image
	* @return the image
	* @throws PortalException if a image with the primary key could not be found
	*/
	public static com.clavisit.clavisit.poc.ddl.images.model.Image getImage(
		long imageId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getImage(imageId);
	}

	/**
	* Returns the image matching the UUID and group.
	*
	* @param uuid the image's UUID
	* @param groupId the primary key of the group
	* @return the matching image
	* @throws PortalException if a matching image could not be found
	*/
	public static com.clavisit.clavisit.poc.ddl.images.model.Image getImageByUuidAndGroupId(
		java.lang.String uuid, long groupId)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getImageByUuidAndGroupId(uuid, groupId);
	}

	/**
	* Updates the image in the database or adds it if it does not yet exist. Also notifies the appropriate model listeners.
	*
	* @param image the image
	* @return the image that was updated
	*/
	public static com.clavisit.clavisit.poc.ddl.images.model.Image updateImage(
		com.clavisit.clavisit.poc.ddl.images.model.Image image) {
		return getService().updateImage(image);
	}

	public static com.liferay.portal.kernel.dao.orm.ActionableDynamicQuery getActionableDynamicQuery() {
		return getService().getActionableDynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery() {
		return getService().dynamicQuery();
	}

	public static com.liferay.portal.kernel.dao.orm.ExportActionableDynamicQuery getExportActionableDynamicQuery(
		com.liferay.exportimport.kernel.lar.PortletDataContext portletDataContext) {
		return getService().getExportActionableDynamicQuery(portletDataContext);
	}

	public static com.liferay.portal.kernel.dao.orm.IndexableActionableDynamicQuery getIndexableActionableDynamicQuery() {
		return getService().getIndexableActionableDynamicQuery();
	}

	/**
	* @throws PortalException
	*/
	public static com.liferay.portal.kernel.model.PersistedModel deletePersistedModel(
		com.liferay.portal.kernel.model.PersistedModel persistedModel)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().deletePersistedModel(persistedModel);
	}

	public static com.liferay.portal.kernel.model.PersistedModel getPersistedModel(
		java.io.Serializable primaryKeyObj)
		throws com.liferay.portal.kernel.exception.PortalException {
		return getService().getPersistedModel(primaryKeyObj);
	}

	/**
	* Returns the number of images.
	*
	* @return the number of images
	*/
	public static int getImagesCount() {
		return getService().getImagesCount();
	}

	/**
	* Returns the OSGi service identifier.
	*
	* @return the OSGi service identifier
	*/
	public static java.lang.String getOSGiServiceIdentifier() {
		return getService().getOSGiServiceIdentifier();
	}

	/**
	* Performs a dynamic query on the database and returns the matching rows.
	*
	* @param dynamicQuery the dynamic query
	* @return the matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQuery(dynamicQuery);
	}

	/**
	* Performs a dynamic query on the database and returns a range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.clavisit.clavisit.poc.ddl.images.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @return the range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end) {
		return getService().dynamicQuery(dynamicQuery, start, end);
	}

	/**
	* Performs a dynamic query on the database and returns an ordered range of the matching rows.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.clavisit.clavisit.poc.ddl.images.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param dynamicQuery the dynamic query
	* @param start the lower bound of the range of model instances
	* @param end the upper bound of the range of model instances (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the ordered range of matching rows
	*/
	public static <T> java.util.List<T> dynamicQuery(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery, int start,
		int end,
		com.liferay.portal.kernel.util.OrderByComparator<T> orderByComparator) {
		return getService()
				   .dynamicQuery(dynamicQuery, start, end, orderByComparator);
	}

	public static java.util.List<com.clavisit.clavisit.poc.ddl.images.model.Image> findFileEntries(
		java.lang.String keyword) {
		return getService().findFileEntries(keyword);
	}

	/**
	* Returns a range of all the images.
	*
	* <p>
	* Useful when paginating results. Returns a maximum of <code>end - start</code> instances. <code>start</code> and <code>end</code> are not primary keys, they are indexes in the result set. Thus, <code>0</code> refers to the first result in the set. Setting both <code>start</code> and <code>end</code> to {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS} will return the full result set. If <code>orderByComparator</code> is specified, then the query will include the given ORDER BY logic. If <code>orderByComparator</code> is absent and pagination is required (<code>start</code> and <code>end</code> are not {@link com.liferay.portal.kernel.dao.orm.QueryUtil#ALL_POS}), then the query will include the default ORDER BY logic from {@link com.clavisit.clavisit.poc.ddl.images.model.impl.ImageModelImpl}. If both <code>orderByComparator</code> and pagination are absent, for performance reasons, the query will not have an ORDER BY clause and the returned result set will be sorted on by the primary key in an ascending order.
	* </p>
	*
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @return the range of images
	*/
	public static java.util.List<com.clavisit.clavisit.poc.ddl.images.model.Image> getImages(
		int start, int end) {
		return getService().getImages(start, end);
	}

	/**
	* Returns all the images matching the UUID and company.
	*
	* @param uuid the UUID of the images
	* @param companyId the primary key of the company
	* @return the matching images, or an empty list if no matches were found
	*/
	public static java.util.List<com.clavisit.clavisit.poc.ddl.images.model.Image> getImagesByUuidAndCompanyId(
		java.lang.String uuid, long companyId) {
		return getService().getImagesByUuidAndCompanyId(uuid, companyId);
	}

	/**
	* Returns a range of images matching the UUID and company.
	*
	* @param uuid the UUID of the images
	* @param companyId the primary key of the company
	* @param start the lower bound of the range of images
	* @param end the upper bound of the range of images (not inclusive)
	* @param orderByComparator the comparator to order the results by (optionally <code>null</code>)
	* @return the range of matching images, or an empty list if no matches were found
	*/
	public static java.util.List<com.clavisit.clavisit.poc.ddl.images.model.Image> getImagesByUuidAndCompanyId(
		java.lang.String uuid, long companyId, int start, int end,
		com.liferay.portal.kernel.util.OrderByComparator<com.clavisit.clavisit.poc.ddl.images.model.Image> orderByComparator) {
		return getService()
				   .getImagesByUuidAndCompanyId(uuid, companyId, start, end,
			orderByComparator);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery) {
		return getService().dynamicQueryCount(dynamicQuery);
	}

	/**
	* Returns the number of rows matching the dynamic query.
	*
	* @param dynamicQuery the dynamic query
	* @param projection the projection to apply to the query
	* @return the number of rows matching the dynamic query
	*/
	public static long dynamicQueryCount(
		com.liferay.portal.kernel.dao.orm.DynamicQuery dynamicQuery,
		com.liferay.portal.kernel.dao.orm.Projection projection) {
		return getService().dynamicQueryCount(dynamicQuery, projection);
	}

	public static ImageLocalService getService() {
		return _serviceTracker.getService();
	}

	private static ServiceTracker<ImageLocalService, ImageLocalService> _serviceTracker =
		ServiceTrackerFactory.open(ImageLocalService.class);
}