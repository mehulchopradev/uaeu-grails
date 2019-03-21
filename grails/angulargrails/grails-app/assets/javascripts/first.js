var app = angular.module('namesgen', []);
app.controller('namesgenctrl', function ($scope) {
  $scope.firstName = 'sunny';
  $scope.lastName = 'chopra';
  $scope.friends = [
    'abc xyz',
    'pqr mno',
  ];

  $scope.addFriends = function () {
    $scope.friends.push($scope.firstName + " " + $scope.lastName);
    $scope.firstName = '';
    $scope.lastName = '';
  };
});
