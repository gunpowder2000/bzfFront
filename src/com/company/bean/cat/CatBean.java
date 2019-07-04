package com.company.bean.cat;

public class CatBean {
		private String catcode;
		private String catname;
		private String catlevel;
		private String catfathercode;
		
		public CatBean(){
			super();
		}
		
		public CatBean(String catcode, String catname, String catlevel,
				String catfathercode) {
			super();
			this.catcode = catcode;
			this.catname = catname;
			this.catlevel = catlevel;
			this.catfathercode = catfathercode;
		}

		public String getCatcode() {
			return catcode;
		}

		public void setCatcode(String catcode) {
			this.catcode = catcode;
		}

		public String getCatname() {
			return catname;
		}

		public void setCatname(String catname) {
			this.catname = catname;
		}

		public String getCatlevel() {
			return catlevel;
		}

		public void setCatlevel(String catlevel) {
			this.catlevel = catlevel;
		}

		public String getCatfathercode() {
			return catfathercode;
		}

		public void setCatfathercode(String catfathercode) {
			this.catfathercode = catfathercode;
		}
}
