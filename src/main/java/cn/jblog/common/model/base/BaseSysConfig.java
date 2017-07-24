package cn.jblog.common.model.base;

import com.jfinal.plugin.activerecord.Model;
import com.jfinal.plugin.activerecord.IBean;

/**
 * Generated by JFinal, do not modify this file.
 */
@SuppressWarnings({"serial", "unchecked"})
public abstract class BaseSysConfig<M extends BaseSysConfig<M>> extends Model<M> implements IBean {

	public M setAuthor(java.lang.String author) {
		set("author", author);
		return (M)this;
	}

	public java.lang.String getAuthor() {
		return get("author");
	}

	public M setTitle(java.lang.String title) {
		set("title", title);
		return (M)this;
	}

	public java.lang.String getTitle() {
		return get("title");
	}

	public M setKeywords(java.lang.String keywords) {
		set("keywords", keywords);
		return (M)this;
	}

	public java.lang.String getKeywords() {
		return get("keywords");
	}

	public M setPowerby(java.lang.String powerby) {
		set("powerby", powerby);
		return (M)this;
	}

	public java.lang.String getPowerby() {
		return get("powerby");
	}

	public M setDescription(java.lang.String description) {
		set("description", description);
		return (M)this;
	}

	public java.lang.String getDescription() {
		return get("description");
	}

	public M setRecord(java.lang.String record) {
		set("record", record);
		return (M)this;
	}

	public java.lang.String getRecord() {
		return get("record");
	}

}
