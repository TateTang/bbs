package com.hnrp.bbs.pojo;


/**
 * С���
 * @author 
 */
public class Type {
	
	    private int id;//
		private  String name;//
		private int count_topics;//
		private  int count_comments;//
		private int is_admin_type;//
		private int types_category_id;//
		
		private Category typeCategory;
		
		public Category getTypeCategory() {
			return typeCategory;
		}

		public void setTypeCategory(Category typeCategory) {
			this.typeCategory = typeCategory;
		}

		public Type() {
			super();
		}
		
		public Type(int id, String name, int count_topics, int count_comments, int is_admin_type,
				int types_category_id) {
			super();
			this.id = id;
			this.name = name;
			this.count_topics = count_topics;
			this.count_comments = count_comments;
			this.is_admin_type = is_admin_type;
			this.types_category_id = types_category_id;
		}


		public int getId() {
			return id;
		}


		public void setId(int id) {
			this.id = id;
		}


		public String getName() {
			return name;
		}


		public void setName(String name) {
			this.name = name;
		}


		public int getCount_topics() {
			return count_topics;
		}


		public void setCount_topics(int count_topics) {
			this.count_topics = count_topics;
		}


		public int getCount_comments() {
			return count_comments;
		}


		public void setCount_comments(int count_comments) {
			this.count_comments = count_comments;
		}


		public int getIs_admin_type() {
			return is_admin_type;
		}


		public void setIs_admin_type(int is_admin_type) {
			this.is_admin_type = is_admin_type;
		}


		public int getTypes_category_id() {
			return types_category_id;
		}


		public void setTypes_category_id(int types_category_id) {
			this.types_category_id = types_category_id;
		}

		@Override
		public String toString() {
			return "Type [id=" + id + ", name=" + name + ", count_topics=" + count_topics + ", count_comments="
					+ count_comments + ", is_admin_type=" + is_admin_type + ", types_category_id=" + types_category_id
					+ "]";
		}
			  
		
			  
}
