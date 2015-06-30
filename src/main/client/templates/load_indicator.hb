<style>
    #dvLoading {
      position: fixed;
      width: 100%;
      height: 100%;
      left: 0;
      top: 70px;
      margin: 0;
      padding: 0;
    }
    #dvLoadingContent {
        background: white url({{dburl 'cavallino' 'images/ilcavallo.jpg' }}) no-repeat center 10px;
        background-size: 300px;
        height: 300px;
        width: 400px;
        z-index: 1000;
        top: 50%;
        margin: auto;
        color: white;
        font-family: sans-serif;
        font-size: 20px;
        text-align: center;
        padding: 10px;
        border: rgb(30, 30, 77) 10px solid;
        border-radius: 12px;
      }

    #dvLoadingIntern {
      padding-top: 80px;
    }

    #dvLoadingTitle {
        margin-bottom: 20px;
    }

</style>
<!--- Loading indicator --->
<div id="dvLoading">
  <div id="dvLoadingContent">
    <div id="dvLoadingIntern">
        <div id="dvLoadingTitle">Cavallino</div>
    </div>
  </div>
</div>
