
package com.doublechaintech.messagecenter.formmessage;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import com.doublechaintech.messagecenter.BaseEntity;
import com.doublechaintech.messagecenter.SmartList;
import com.doublechaintech.messagecenter.MultipleAccessKey;
import com.doublechaintech.messagecenter.MessagecenterUserContext;

import com.doublechaintech.messagecenter.genericform.GenericForm;

import com.doublechaintech.messagecenter.genericform.GenericFormDAO;


public interface FormMessageDAO{

	
	public FormMessage load(String id, Map<String,Object> options) throws Exception;
	public void enhanceList(List<FormMessage> formMessageList);
	public void collectAndEnhance(BaseEntity ownerEntity);
	
	public void alias(List<BaseEntity> entityList);
	
	
	
	
	public FormMessage present(FormMessage formMessage,Map<String,Object> options) throws Exception;
	public FormMessage clone(String id, Map<String,Object> options) throws Exception;
	
	
	
	public FormMessage save(FormMessage formMessage,Map<String,Object> options);
	public SmartList<FormMessage> saveFormMessageList(SmartList<FormMessage> formMessageList,Map<String,Object> options);
	public SmartList<FormMessage> removeFormMessageList(SmartList<FormMessage> formMessageList,Map<String,Object> options);
	public SmartList<FormMessage> findFormMessageWithKey(MultipleAccessKey key,Map<String, Object> options);
	public int countFormMessageWithKey(MultipleAccessKey key,Map<String, Object> options);
	public Map<String, Integer> countFormMessageWithGroupKey(String groupKey, MultipleAccessKey filterKey,
			Map<String, Object> options);
	public void delete(String formMessageId, int version) throws Exception;
	public FormMessage disconnectFromAll(String formMessageId, int version) throws Exception;
	public int deleteAll() throws Exception;

	
	
	
	public SmartList<FormMessage> queryList(String sql, Object ... parmeters);
 
 	public SmartList<FormMessage> findFormMessageByForm(String genericFormId, Map<String,Object> options);
 	public int countFormMessageByForm(String genericFormId, Map<String,Object> options);
 	public Map<String, Integer> countFormMessageByFormIds(String[] ids, Map<String,Object> options);
 	public SmartList<FormMessage> findFormMessageByForm(String genericFormId, int start, int count, Map<String,Object> options);
 	public void analyzeFormMessageByForm(SmartList<FormMessage> resultList, String genericFormId, Map<String,Object> options);

 
 
}


