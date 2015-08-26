var app = angular.module('myApp', []);
app.controller('personCtrl', function($scope, $http) {	

    getBriefList();
    
    $scope.viewUser = function(id) {
    	
        $http.get("http://localhost:8080/sports/rest/api/player/"+ id )
        .success(function(response) {
        	 var errorCode = response.errorCode;
             var httpErorr = response.message;
             if (!angular.isUndefined(errorCode)) {
                 $scope.errorMessageShow = true;
                 $scope.errorButtonHide = true;
                 $scope.errorMessage = response.message;

             } else {
                 $scope.errorMessageShow = false;
                 $scope.errorButtonHide = false;
                 $scope.detailedPerson = response;
				 $scope.briefContent = !$scope.briefContent;
				 $scope.detailedContent = !$scope.detailedContent
             }     		
             ;});          
    };
    
    $scope.backToUserList = function(){
    	getBriefList();
		 $scope.briefContent = !$scope.briefContent;
  	    
    }; 
    
    function getBriefList(){
        $http.get("http://localhost:8080/sports/rest/api/players")
        .success(function(response) {
						        	var errorCode = response.errorCode;
						            var httpErorr = response.message;
						            if (!angular.isUndefined(errorCode)) {
						                $scope.errorMessageShow = true;
						                $scope.errorButtonHide = true;
						                $scope.errorMessage = response.message;
						
						            } else {
						            	$scope.persons = response;
						            	 $scope.detailedContent = !$scope.detailedContent;
						                 $scope.sortType     = 'firstName'; 			//  default sort type
						                 $scope.sortReverse  = false;  				//  default sort order
						            }
        	
        	
        	;}); 
       
    };
    
   
});

