(function(){

    /*******************************************************
     * app.js
     *******************************************************/
    var app = angular.module('app1', [
        'app1.routes',
        'ngMaterial',
        'ngMaterialSidemenu',
        'ngSanitize'
    ]);

    app.run(['$http', runCallback]);
    function runCallback($http) {
        console.log('app1 runCallback() started')
    }

    app.directive('bindHtmlCompile', ['$compile', function ($compile) {
        return {
            restrict: 'A',
            link: function (scope, element, attrs) {
                scope.$watch(function () {
                    return scope.$eval(attrs.bindHtmlCompile);
                }, function (value) {
                    // In case value is a TrustedValueHolderType, sometimes it
                    // needs to be explicitly called into a string in order to
                    // get the HTML string.
                    element.html(value && value.toString());
                    // If scope is provided use it, otherwise use parent scope
                    var compileScope = scope;
                    if (attrs.bindHtmlScope) {
                        compileScope = scope.$eval(attrs.bindHtmlScope);
                    }
                    $compile(element.contents())(compileScope);
                });
            }
        };
    }]);

})();