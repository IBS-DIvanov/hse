/*
 * This file launches the application by asking Ext JS to create
 * and launch() the Application class.
 */
Ext.application({
    extend: 'example1.Application',

    name: 'example1',

    requires: [
        // This will automatically load all classes in the example1 namespace
        // so that application classes do not need to require each other.
        'example1.*'
    ],

    // The name of the initial view to create.
    mainView: 'example1.view.main.Main'
});
