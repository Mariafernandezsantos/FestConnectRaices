import { ComponentFixture, TestBed } from '@angular/core/testing';

import { PlaylistGroupComponent } from './playlist-group.component';

describe('PlaylistGroupComponent', () => {
  let component: PlaylistGroupComponent;
  let fixture: ComponentFixture<PlaylistGroupComponent>;

  beforeEach(() => {
    TestBed.configureTestingModule({
      declarations: [PlaylistGroupComponent]
    });
    fixture = TestBed.createComponent(PlaylistGroupComponent);
    component = fixture.componentInstance;
    fixture.detectChanges();
  });

  it('should create', () => {
    expect(component).toBeTruthy();
  });
});
