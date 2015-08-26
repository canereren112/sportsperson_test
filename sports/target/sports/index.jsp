<!DOCTYPE html>
<html>
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/bootswatch/3.2.0/sandstone/bootstrap.min.css">
<link rel="stylesheet" href="http://maxcdn.bootstrapcdn.com/font-awesome/4.2.0/css/font-awesome.min.css">

<link href="css/home.css" rel="stylesheet" type="text/css"/>

<script src="http://ajax.googleapis.com/ajax/libs/angularjs/1.2.23/angular.min.js"></script>

<body >
<div class="main_container">

<div class="header_content content_background_gradient">
	<div class= "header_content_div">
		<p class="header_content_div_text"> Mobenga SportPerson's Test Application</p>
	</div>
</div>
<div class="main_content">
	<div class="main_div">
		<div ng-app="myApp" ng-controller="personCtrl">
			<div class="brief_list_content" ng-hide="briefContent">
			<p class="content_brief_header_style">Sports Persons Brief List</p>
			       <div >
                     <label  disabled="errorMessageShow">{{ errorMessage}}</label>
                  </div>
				<table class="table table-striped">
				  <thead><tr>
				    <th></th>
				    <th><a href="#" ng-click="sortType = 'firstName'; sortReverse = !sortReverse">First Name
				    	        <span ng-show="sortType == 'firstName' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'firstName' && sortReverse" class="fa fa-caret-up"></span>
				    </a></th>
				    <th><a href="#" ng-click="sortType = 'lastName'; sortReverse = !sortReverse">Last Name
				    			<span ng-show="sortType == 'lastName' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'lastName' && sortReverse" class="fa fa-caret-up"></span></a></th>
				     <th><a href="#" ng-click="sortType = 'teamName'; sortReverse = !sortReverse">Team Name
				    			<span ng-show="sortType == 'teamName' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'teamName' && sortReverse" class="fa fa-caret-up"></span></a></th>
				     <th><a href="#" ng-click="sortType = 'age'; sortReverse = !sortReverse">Age
				    			<span ng-show="sortType == 'age' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'age' && sortReverse" class="fa fa-caret-up"></span></a></th>
				     <th><a href="#" ng-click="sortType = 'height'; sortReverse = !sortReverse">Height&nbsp;&nbsp;&nbsp;
				    			<span ng-show="sortType == 'height' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'height' && sortReverse" class="fa fa-caret-up"></span></a></th>
				     <th><a href="#" ng-click="sortType = 'weight'; sortReverse = !sortReverse">Weight
				    			<span ng-show="sortType == 'weight' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'weight' && sortReverse" class="fa fa-caret-up"></span></a></th>
				     <th><a href="#" ng-click="sortType = 'positionText'; sortReverse = !sortReverse">Position
				    			<span ng-show="sortType == 'positionText' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'positionText' && sortReverse" class="fa fa-caret-up"></span></a></th>
				     <th><a href="#" ng-click="sortType = 'apps'; sortReverse = !sortReverse">Apps
				    			<span ng-show="sortType == 'apps' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'apps' && sortReverse" class="fa fa-caret-up"></span></a></th>
				     <th><a href="#" ng-click="sortType = 'goal'; sortReverse = !sortReverse">Goal
				    			<span ng-show="sortType == 'goal' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'goal' && sortReverse" class="fa fa-caret-up"></span></a></th>
				     <th><a href="#" ng-click="sortType = 'assistTotal'; sortReverse = !sortReverse">Assist
				    			<span ng-show="sortType == 'assistTotal' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'assistTotal' && sortReverse" class="fa fa-caret-up"></span></a></th>
				     <th><a href="#" ng-click="sortType = 'redCard'; sortReverse = !sortReverse">Red Card
				    			<span ng-show="sortType == 'redCard' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'redCard' && sortReverse" class="fa fa-caret-up"></span></a></th>
				     <th><a href="#" ng-click="sortType = 'yellowCard'; sortReverse = !sortReverse">Yellow Card
				    			<span ng-show="sortType == 'yellowCard' && !sortReverse" class="fa fa-caret-down"></span>
       							<span ng-show="sortType == 'yellowCard' && sortReverse" class="fa fa-caret-up"></span></a></th>
			
				   
			    
				  </tr></thead>
				  <tbody>
				  <tr ng-repeat="p in persons | orderBy:sortType:sortReverse">
				    <td>
				      <button class="view_button btn btn-success" ng-click="viewUser(p.playerId)">
				      	<span class="glyphicon glyphicon-user"></span> View
				      </button>
				    </td>
				    <td>{{ p.firstName | uppercase }}</td>
				    <td>{{ p.lastName  | uppercase}}</td>
				    <td>{{ p.teamName | uppercase}}</td>
				    <td>{{ p.age }}</td>
				    <td>{{ p.height + ' cm'}} </td>
				    <td>{{ p.weight + ' kg'}}</td>
				    <td>{{ p.positionText }}</td>
				    <td>{{ p.apps }}</td>
				    <td>{{ p.goal }}</td>
				    <td>{{ p.assistTotal }}</td>
				    <td>{{ p.redCard }}</td>
				    <td>{{ p.yellowCard }}</td>
				    	    
				  </tr></tbody>
				</table>
			</div>
			<div class="detailed_list_content" ng-hide="detailedContent">
			<div class="personal_information_content">
			<p class="content_header_style">Personal Information</p>
			<div class="back_button">
				<button class="btn " ng-click="backToUserList()">
				<span class="glyphicon glyphicon-arrow-left"></span>
				      	Back
				      </button>
			</div>
				<table class="personal_information_table table table-striped">
				  <thead><tr>
					<th>Player Id</th>				  
				    <th>First Name</th>
				    <th>Last Name</th>
				    <th>Active</th>
				    <th>Operation</th>
				    <th>Team Id</th>
				    <th>Team Name</th>
				    <th>Played Positions</th>
				    <th>Age</th>
				    <th>Height</th>
				    <th>Weight</th>
				    <th>Position </th>

				    
			    
				  </tr></thead>
				  <tbody><tr >
				    <td>{{ detailedPerson.playerId }}</td>
				    <td>{{ detailedPerson.firstName | uppercase }}</td>
				    <td>{{ detailedPerson.lastName | uppercase }}</td>
				    <td>{{ {true:'YES', false:'NO'}[detailedPerson.isActive]}}</td>
				    <td>{{ {true:'YES', false:'NO'}[ detailedPerson.isOpta] }}</td>
				    <td>{{ detailedPerson.teamId }}</td>
				    <td>{{ detailedPerson.teamName | uppercase }}</td>
				    <td>{{ detailedPerson.playedPositions }}</td>
				    <td>{{ detailedPerson.age }}</td>
				    <td>{{ detailedPerson.height + ' cm' }}</td>
				    <td>{{ detailedPerson.weight + ' kg'}}</td>
				    <td>{{ detailedPerson.positionText }}</td>
				    	    
				  </tr></tbody>
				</table>
			</div>	
			<div class="league_stats_content">
			<p class="content_header_style">Leauge Statistics</p>
			
				<table class="league_stats_table table table-striped">
				  <thead><tr>
				    <th>Ranking</th>
				    <th>Season No</th>
				    <th>Season Name</th>
				    <th>Tournament Id</th>
				    <th>Tournament Region ID</th>
				    <th>Tournament Region Code</th>
				    <th>Region Code</th>
				    <th>Tournament Name</th>
				    <th>Tournament Short Name</th>


				    
			    
				  </tr></thead>
				  <tbody><tr >
				    <td>{{ detailedPerson.ranking }}</td>
				    <td>{{ detailedPerson.seasonId }}</td>
				    <td>{{ detailedPerson.seasonName | uppercase}}</td>
				    <td>{{ detailedPerson.tournamentId }}</td>
				    <td>{{ detailedPerson.tournamentRegionId }}</td>
				    <td>{{ detailedPerson.tournamentRegionCode }}</td>
				    <td>{{ detailedPerson.regionCode | uppercase}}</td>
				    <td>{{ detailedPerson.tournamentName | uppercase }}</td>
				    <td>{{ detailedPerson.tournamentShortName}}</td>

				    	    
				  </tr></tbody>
				</table>
			</div>	
			<div class="match_statistics_content">
			<p class="content_header_style">Match Statistics</p>
				<table class="match_statistics_table table table-striped">
				  <thead><tr>
				    <th>Appearances</th>
				    <th>Substitutions</th>
				    <th>Played Time</th>
				    <th>Goal</th>
				    <th>Assist</th>
				    <th>Yellow Card</th>
				    <th>Red Card</th>
				    <th>Man of the Match Count</th>
				    <th>Name</th>
				    <th>Man of the Match</th>
				    <th>Positions</th>


				    
			    
				  </tr></thead>
				  <tbody><tr >
				    <td>{{ detailedPerson.apps }}</td>
				    <td>{{ detailedPerson.subOn }}</td>
				    <td>{{ detailedPerson.minsPlayed + ' mins' }}</td>
				    <td>{{ detailedPerson.goal }}</td>
				    <td>{{ detailedPerson.assistTotal }}</td>
				    <td>{{ detailedPerson.yellowCard }}</td>
				    <td>{{ detailedPerson.redCard }}</td>
				    <td>{{ detailedPerson.manOfTheMatch }}</td>
				    <td>{{ detailedPerson.name | uppercase}}</td>
				    <td>{{ {true:'YES', false:'NO'}[ detailedPerson.isManOfTheMatch]}}</td>
				    <td>{{ detailedPerson.playedPositionsShort }}</td>
				    	    
				  </tr></tbody>
				</table>
			</div>	
			<div class="rating_statistics_content">
				<p class="content_header_style">Rating Statistics</p>
			
				<table class="rating_statistics_table table table-striped">
				  <thead><tr>
				    <th>Rating</th>
				    <th>Shots per Game</th>
				    <th>Aerial Won Per Game</th>
				    <th>Succes Pass Rate</th>



				    
			    
				  </tr></thead>
				  <tbody><tr >
				    <td>{{ detailedPerson.rating | number:2}}</td>
				    <td>{{ detailedPerson.shotsPerGame | number:2  }}</td>
				    <td>{{ detailedPerson.aerialWonPerGame | number:2 }}</td>
				    <td>{{ detailedPerson.passSuccess | number:2}}</td>
				    	    
				  </tr></tbody>
				</table>
			</div>	
			</div>				
				
		</div>
	</div>
</div>
	<div class="content_background_gradient footer_content">
		<div class= "footer_content_div">
			<p class="footer_content_div_text"> This content created by Omer Caner EREN, canereren112@gmail.com</p>
		</div>
	</div>
</div>

<script src = "js/sportPersons.js"></script>
</body>
</html>