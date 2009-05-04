package org.pentaho.commons.metadata.mqleditor.editor.service.impl;

import java.util.List;

import org.pentaho.commons.metadata.mqleditor.IConnection;
import org.pentaho.commons.metadata.mqleditor.IDatasource;
import org.pentaho.commons.metadata.mqleditor.beans.BusinessData;
import org.pentaho.commons.metadata.mqleditor.editor.service.DatasourceService;
import org.pentaho.commons.metadata.mqleditor.editor.service.DatasourceServiceException;
import org.pentaho.commons.metadata.mqleditor.utils.SerializedResultSet;
import org.pentaho.ui.xul.XulServiceCallback;

public class DatasourceServiceDebugImpl implements DatasourceService{

  DatasourceServiceDelegate SERVICE;
  public DatasourceServiceDebugImpl(){
    SERVICE = new DatasourceServiceDelegate();
  }
 
  public void getDatasources(XulServiceCallback<List<IDatasource>> callback) {
    callback.success(SERVICE.getDatasources());
  }
  public void getDatasourceByName(String name, XulServiceCallback<IDatasource> callback) {
    callback.success(SERVICE.getDatasourceByName(name));
  }
  public void addDatasource(IDatasource datasource, XulServiceCallback<Boolean> callback) {
    callback.success(SERVICE.addDatasource(datasource));
  }
  
  public void updateDatasource(IDatasource datasource, XulServiceCallback<Boolean> callback) {
    callback.success(SERVICE.updateDatasource(datasource));
  }
  public void deleteDatasource(IDatasource datasource, XulServiceCallback<Boolean> callback) {
    callback.success(SERVICE.deleteDatasource(datasource));
  }
  public void deleteDatasource(String name, XulServiceCallback<Boolean> callback) {
    callback.success(SERVICE.deleteDatasource(name));
  }

  public void doPreview(IConnection connection, String query, String previewLimit, XulServiceCallback<SerializedResultSet> callback)
      throws DatasourceServiceException {
    callback.success(SERVICE.doPreview(connection, query, previewLimit));
  }

  public void doPreview(IDatasource datasource, XulServiceCallback<SerializedResultSet> callback)
      throws DatasourceServiceException {
    callback.success(SERVICE.doPreview(datasource));
  }


  
  public void generateModel(String modelName, IConnection connection, String query, String previewLimit,
      XulServiceCallback<BusinessData> callback) throws DatasourceServiceException {
   callback.success(SERVICE.generateModel(modelName, connection, query, previewLimit));
  }

  public void saveModel(BusinessData businessData, Boolean overwrite, XulServiceCallback<Boolean> callback)
      throws DatasourceServiceException {
    callback.success(SERVICE.saveModel(businessData, overwrite));
  }

}

  