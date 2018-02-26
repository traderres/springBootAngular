(function() {

    angular.module('app1')
        .controller('navController', ['$scope', '$mdSidenav', '$sce', Callback]);

    function Callback($scope, $mdSidenav, $sce)
    {
        console.log('navController started.');

        var navVM = this;

        navVM.showItem = showItem;
        navVM.openLeftMenu = openLeftMenu;
        navVM.updateHtml = updateHtml;
        navVM.clearHtml = clearHtml;

        navVM.html = 'Starting HTML';

        function updateHtml()
        {
            navVM.html = "ng-mouseover works: <span style='cursor: pointer; text-decoration: underline' ng-mouseover=\"navVM.showItem('1.1.1.1')\")>1.1.1.1</span></br>" +
                         "ng-click works: <span style='cursor: pointer; text-decoration: underline' ng-click=\"navVM.showItem('2.2.2.2')\")>2.2.2.2</span></br>" +
                         "ng-click works: <span style='cursor: pointer; text-decoration: underline' ng-click=\"navVM.showItem('3.3.3.3')\")>3.3.3.3</span></br>";

        }

        function clearHtml()
        {
            navVM.html = '';
        }

        function showItem(info)
        {
            console.log('showItem()   info=', info);

            // Display the info on the page
            navVM.status="User clicked on " + info;
        }

        function openLeftMenu()
        {
            $mdSidenav('left').toggle();
        }
    }
})();