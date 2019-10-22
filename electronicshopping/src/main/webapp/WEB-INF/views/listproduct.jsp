<div class="container">
	 <div class="row">
		 <!--  to display sidebar -->
		 <div class="col-md-3">
		 	<%@include file="./shared/sidebar.jsp" %><a><h2>Sidebar</h2></a>
		 </div>
	 
		 <!--  to display product -->
		 <div class="col-md-9">
		 	 <div class="row">
		 	    <!--Breadcrumbs component */  --> 
		 	    	<div class="col-lg-12">
		 	    	<h2>Main Article</h2>
		 	    	<c:if test ="${userClickAllProducts == true}">
		 	    		 
		 	    			<ol class="breadcrumb">
		 	    				<li><a href="${contextRoot}/home">Home</a></li>
		 	    				<li class="active">All Products</li>
		 	    						 	    				
		 	    			</ol>
		 	    		</c:if>
		 	    		<c:if test ="${userClickCategoryProducts == true}">
		 	    		 
		 	    			<ol class="breadcrumb">
		 	    				<li><a href="${contextRoot}/home">Home</a></li>
		 	    				<li class="active">Category</li>
		 	    				<li class="active">${category.name}</li>
		 	    				
		 	    			</ol>
		 	    		</c:if>
		 	    		
		 	    		
		 	    		
		 	    	</div>
		 	 
		 	 </div>	
		 </div>
	 
	 
	 </div>
</div>