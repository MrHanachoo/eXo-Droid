/**
 * Created by exoplatform on 27/01/15.
 */
(function($){

  var _messageConfirmCBController = function (type,message) {
    var alertDOM =  $('#JuzExoAddNodeAlertContainer');
    if(type != null && type != "") {
      var icon = type.charAt(0).toUpperCase() + type.slice(1);
      var strIcon = "<i class='uiIcon" + icon + "'></i>";
      alertDOM.removeClass();
      alertDOM.addClass('alert');
      alertDOM.addClass('alert-' + type);
      alertDOM.html(strIcon + message);
      alertDOM.css('visibility', 'visible');
      alertDOM.show();
      setTimeout(function() {
        alertDOM.css("visibility" , "hidden");
        alertDOM.hide();
      }, 3000);
    }
  };






          
  var _disPlayInfoMsgCB = function(msg){
    _messageConfirmCBController('info',msg);
  };
  var _disPlaySuccessMsgCB = function(msg){
    _messageConfirmCBController('success',msg);
  };
  var _disPlayWarningMsgCB = function(msg){
    _messageConfirmCBController('warning',msg);
  };
  var _disPlayErrorMsgCB = function(msg){
    _messageConfirmCBController('error',msg);
  };









  function _createNode(nodeName){

    _disPlayInfoMsgCB('creating ... ');
    $.ajax({
    url: "/portal/rest/jcr_crud/add_node/"+nodeName,
    success: function(result){
                _disPlayInfoMsgCB(result);
            }
            });
  };
  $(document).ready(function(){
    $(document).on('click.exo_add_node_button_id','button#exo_add_node_button_id',function(){
      var nodeName = $("#exo_add_node_input_id").val();
      _createNode(nodeName);
    });

  });



  function _deleteNode(nodeName){
    _disPlayInfoMsgCB('deleting ... ');
    $.ajax(
    {
    url: "/portal/rest/jcr_crud/delete_node/"+nodeName,
    success: function(result){
                  _disPlayInfoMsgCB(result);
                  }
    });
  };
  $(document).ready(function(){
     $(document).on('click.exo_delete_node_button_id','button#exo_delete_node_button_id',function(){
       var nodeName = $("#exo_delete_node_input_id").val();

       _deleteNode(nodeName);
     });
  });


function _updateNode(nodeName, propertyName, propertyValue){
    _disPlayInfoMsgCB('updating ... ');
    //alert(nodeName+" "+propertyName+" "+propertyValue);
    $.ajax(
    {
    url: "/portal/rest/jcr_crud/update_node/"+nodeName+"/"+propertyName+"/"+propertyValue,

    success: function(result){
                  _disPlayInfoMsgCB(result);
                  }
    });
  };
  $(document).ready(function(){
     $(document).on('click.exo_update_node_button_id','button#exo_update_node_button_id',function(){
       var nodeName = $("#exo_update_node_input_node_name_id").val();
       var propertyName = $("#exo_update_node_input_property_name_id").val();
       var propertyValue = $("#exo_update_node_input_property_value_id").val();

       _updateNode(nodeName, propertyName, propertyValue);
     });
  });



})($);