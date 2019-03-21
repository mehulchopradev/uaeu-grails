<!DOCTYPE html>
<html>
  <head>
    <meta charset="utf-8">
    <title></title>
    <script src="https://cdnjs.cloudflare.com/ajax/libs/angular.js/1.5.6/angular.min.js"></script>
    <asset:javascript src="first.js" />
  </head>
  <body ng-app="namesgen" ng-controller="namesgenctrl">
    <p>
      <input type="text" placeholder="First Name" ng-model="firstName">
    </p>
    <p>
      <input type="text" placeholder="Last Name" ng-model="lastName">
    </p>
    <p>
      Full Name : {{ firstName + " " + lastName }}
    </p>
    <p>
      <button ng-click="addFriends()">Add</button>
    </p>
    <ul>
      <li ng-repeat="friend in friends">
        {{ friend }}
      </li>
    </ul>
  </body>
</html>
